package kr.prt.partners.controllers;

import kr.prt.partners.models.Estimate;
import kr.prt.partners.models.User;
import kr.prt.partners.models.UserResponse;
import kr.prt.partners.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserViewController {

    private UserService userService;
    @Autowired
    public UserViewController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/view")
    public String user(Model model) {
        List<User> users = userService.userRead();
        System.out.println(users.get(0).getUser_name());
        model.addAttribute("users", users);
        return "user/view";
    }

    // user join
    @GetMapping("/user/form")
    public String createForm() {
        return "user/form";
    }

    // user join 확인
    @RequestMapping("/user/new/{id}")
    public String userForm(@RequestParam("user_id") String user_id, @RequestParam("user_name") String user_name,
                           @RequestParam("user_tel") String user_tel, @RequestParam("user_email") String user_email, Model model) {
        System.out.println(user_email);
        userService.create(user_id, user_name, user_tel, user_email);
        model.addAttribute("users", user_id);
        return "user/new";
    }

    // user {id} 확인
    @GetMapping("/user/find/form")
    public String findForm() {
        return "user/find/form";
    }

    @RequestMapping("/user/find/new/{no}")
    public String findForm(@RequestParam("user_no") Integer user_no, Model model) {
        List<User> user = userService.find(user_no);
        System.out.println(user.get(0).getUser_name());
        model.addAttribute("userNo", user);
        return "user/find/new";
    }

}
