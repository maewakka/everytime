package hongbro.everytime.controller;

import hongbro.everytime.domain.User;
import hongbro.everytime.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
        userService.SignUp(user);
        return "redirect:/";
    }

    @RequestMapping("/LoginForm/signup/dupCheck")
    @ResponseBody
    public boolean dup_Check(@RequestBody Map userInfo) {
        if(userService.dupCheck(userInfo)) {
            return true;
        }
        return  false;
    }

    @RequestMapping("/LoginForm/login/loginCheck")
    public String loginCheck() {
        return "/LoginForm/login";
    }
}
