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
    public static int USERSID;


    @Autowired
    private SignAndLoginService signAndLoginService;

    @RequestMapping(value = "/sign", method = RequestMethod.POST)
    public String sign(@RequestParam("name") String name,
                       @RequestParam("account") String account,
                       @RequestParam("password") String password,
                       @RequestParam("identity") String identity,
                       Model model) {

        if(name.isEmpty()||account.isEmpty()||password.isEmpty()||identity.isEmpty()){
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
            }else {
                model.addAttribute("errorMessage", "注册失败，请重试");
            }
        } catch (DuplicateKeyException e) {
            model.addAttribute("errorMessage", "该账号已经存在，请选择其他账号");
        } catch (Exception e) {
            model.addAttribute("errorMessage","注册失败，请重试");
        }
        return "signResult";
    }

    @RequestMapping("/login")
    public String login(
            @RequestParam("account") String account,
            @RequestParam("password") String password,
            Model model) {

        String path = null;
        if(account.isEmpty() || password.isEmpty()){
            return "loginPage";
        }
        try{
        Users users = signAndLoginService.login(account, password);
        if(users == null){
            path = "loginResult";
        }else{
            this.USERSID = users.getUserID();
            if(users.getIdentity().equals("admin")){
                path = "redirect:/adminFunction/allTrainee";
            } else if (users.getIdentity().equals("coach")) {
                path = "redirect:/coachFunction/personInformation";
            } else if (users.getIdentity().equals("trainee")) {
                path = "redirect:/traineeFunction/personInformation";
            }
        }
        }catch (Exception e){
            path = "loginResult";
        }
        return path;
    }

}
