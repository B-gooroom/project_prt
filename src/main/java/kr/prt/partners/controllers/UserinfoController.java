package kr.prt.partners.controllers;

import kr.prt.partners.models.User;
import kr.prt.partners.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserinfoController {

    private UserService userService;
    @Autowired
    public UserinfoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user-info")
    public String user(Model model) {
        List<User> users = userService.userRead();
        System.out.println(users);
        model.addAttribute("users", users);
        return "user-info";
    }
}
