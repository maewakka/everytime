package hongbro.everytime.controller;

import hongbro.everytime.domain.User;
import hongbro.everytime.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginFormController {

    @Autowired
    UserService userService;

    @RequestMapping("/LoginForm/login")
    public String login() {
        return "LoginForm/login";
    }

    @RequestMapping("/LoginForm/signup")
    public String signup() {
        return "LoginForm/signup";
    }

    @RequestMapping("/LoginForm/findallUser")
    public String findallUser(Model model) {
        List<User> userList = userService.findallUser();
        model.addAttribute("userList", userList);
        return "LoginForm/findallUser";
    }

    @PostMapping("/LoginForm/signup/submit")
    public String signup_submit(@ModelAttribute User user) {

        System.out.println("Signup user, id is " + user.getUserID() + " , email is" + user.getUserEmail());

        userService.SignUp(user);

        return "redirect:/";
    }
}
