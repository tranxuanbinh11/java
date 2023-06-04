package tranxuanbinh.net.QLNS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/welcome")
    public String greeting() {
        return "welcome";
    }

    @GetMapping("/")
    public String index() {
        return "welcome";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
