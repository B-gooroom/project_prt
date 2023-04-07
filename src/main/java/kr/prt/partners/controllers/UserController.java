package kr.prt.partners.controllers;

import kr.prt.partners.models.User;
import kr.prt.partners.models.UserResponse;
import kr.prt.partners.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class UserController {

    @Autowired
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserResponse users() {
        List<User> users = userService.userRead();
        System.out.println(users);
//        return new User();
        return new UserResponse("read", users);
    }
}
