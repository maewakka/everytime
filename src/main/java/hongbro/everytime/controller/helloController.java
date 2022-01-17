package hongbro.everytime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @ResponseBody
    @RequestMapping("/")
    public String hello() {
        return "자 이제 시작이야~";
    }
}
