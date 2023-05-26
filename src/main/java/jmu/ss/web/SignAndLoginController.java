package jmu.ss.web;

import jmu.ss.entity.Users;
import jmu.ss.service.SignAndLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/signAndLogin")
public class SignAndLoginController {

    @Autowired
    private SignAndLoginService signAndLoginService;

    @RequestMapping(value = "/sign", method = RequestMethod.GET)
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
        boolean flag = signAndLoginService.sign(users);
        if(flag == true){
            model.addAttribute("userName",name);
        }else {
            model.addAttribute("userName",null);
        }
        return "signResult";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
