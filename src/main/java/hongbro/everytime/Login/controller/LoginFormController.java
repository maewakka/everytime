package hongbro.everytime.Login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFormController {

    @RequestMapping("/LoginForm/login")
    public String login() {
        return "LoginForm/login";
    }

    @RequestMapping("/LoginForm/signup")
    public String signup() {
        return "LoginForm/signup";
    }

}
