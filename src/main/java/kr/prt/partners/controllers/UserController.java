package kr.prt.partners.controllers;

import io.swagger.v3.oas.annotations.Parameter;
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

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public UserResponse users() {
        List<User> users = userService.userRead();
        System.out.println(users);
//        return new User();
        return new UserResponse("read", users);
    }

    @RequestMapping(path = "/user/{index}", method = RequestMethod.GET)
    public UserResponse find(Integer userNo) {
        List<User> find = userService.find(userNo);
        System.out.println(find);
        return new UserResponse("find", find);
//        return new UserResponse("find", userNo);
    }
//    @RequestMapping(path = "/user/{index}", method = RequestMethod.GET)
//    public UserResponse find(@PathVariable("userNo") int index) {
//        List<User> find = userService.find(index);
//        System.out.println(find);
//        return new UserResponse("find");
////        return new UserResponse("find", userNo);
//    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public UserResponse create(User user) {
        userService.create(user);
        return new UserResponse("create");
    }
//    public String userCreate(User user) {
//        userService.create(user);
//        return  "redirect:/";
//    }

    @RequestMapping(path = "/user/{index}", method = RequestMethod.DELETE)
    public UserResponse delete(@PathVariable("index") int index) {
        userService.delete(index);
        return new UserResponse("delete");
    }

//    @RequestMapping(path = "/user/{index}", method = RequestMethod.PATCH)
//    public UserResponse update(
//            @PathVariable("index") int index,
////            @RequestBody String user_name
////            @RequestBody User user
////            String user_name
////            User user
//            @Parameter User user
//    ) {
//        userService.update(index, user);
//        return new UserResponse("update");
//    }
}
