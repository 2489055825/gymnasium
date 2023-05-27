package jmu.ss.web;

import jmu.ss.entity.Users;
import jmu.ss.service.SignAndLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/signAndLogin")
public class SignAndLoginController {

    @Autowired
    private SignAndLoginService signAndLoginService;

    @RequestMapping(value = "/sign", method = RequestMethod.POST)
    public String sign(@RequestParam("name") String name,
                       @RequestParam("account") String account,
                       @RequestParam("password") String password,
                       @RequestParam("identity") String identity,
                       Model model) {

        if(name==null||account==null||password==null||identity==null){
            return "signPage";
        }
        Users users = new Users();
        users.setName(name);
        users.setAccount(account);
        users.setPassword(password);
        users.setIdentity(identity);
        try{
            boolean flag = signAndLoginService.sign(users);
            if(flag == true){
                model.addAttribute("userName",name);
                model.addAttribute("errorMessage",null);
            }
        } catch (DuplicateKeyException e) {
            model.addAttribute("errorMessage", "该账号已经存在，请选择其他账号");
        }
        return "signResult";
    }

    @RequestMapping("/login")
    public String login(
            @RequestParam("account") String account,
            @RequestParam("password") String password,
            Model model) {

        String path = null;
        if(account == null || password == null){
            return "loginPage";
        }
        Users users = signAndLoginService.login(account, password);
        if(users == null){
            path = "loginResult";
        }else{
            if(users.getIdentity().equals("admin")){
                path = "adminPage-home";
            } else if (users.getIdentity().equals("coach")) {
                path = "coachPage-home";
            } else if (users.getIdentity().equals("trainee")) {
                path = "traineePage-home";
            }
        }
        return path;
    }

}
