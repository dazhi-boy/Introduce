package dazhi.admin.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogInOutController {
    @RequestMapping("/")
    @ResponseBody
    public String root() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index";
    }

    @RequestMapping("/user/index")
    @ResponseBody
    public String userIndex() {
        return "user/index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        return "login";
    }

    @RequestMapping("/login-error")
    @ResponseBody
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }
}
