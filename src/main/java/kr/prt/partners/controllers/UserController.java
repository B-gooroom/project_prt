package kr.prt.partners.controllers;

import io.swagger.v3.oas.annotations.Parameter;
import kr.prt.partners.models.User;
import kr.prt.partners.models.UserResponse;
import kr.prt.partners.repositories.UserRepository;
import kr.prt.partners.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class UserController {


    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public UserResponse users() {
        List<User> users = userService.userRead();
//        List<User> users = userRepository.read();
        System.out.println(users);
        return new UserResponse("read", users);
    }

    @RequestMapping(path = "/user/{index}", method = RequestMethod.GET)
    public UserResponse find(Integer userNo) {
        List<User> find = userService.find(userNo);
        System.out.println(find);
        return new UserResponse("find", find);
//        return new UserResponse("find", userNo);
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public UserResponse create(User user) {
        userService.create(user);
//        userRepository.create(user);
        return new UserResponse("create");
    }

    @RequestMapping(path = "/user/{index}", method = RequestMethod.DELETE)
    public UserResponse delete(@PathVariable("index") int index) {
        userService.delete(index);
//        userRepository.delete(index);
        return new UserResponse("delete");
    }

    @RequestMapping(path = "/user/{index}", method = RequestMethod.PATCH)
    public UserResponse update(
            @PathVariable("index") int index,
//            @RequestBody String user_name
            User user
    ) {
        System.out.println(user.getUser_name());
        System.out.println(index);
        userService.update(index, user.getUser_name());
//        userRepository.update(index, user.getUser_name());
        return new UserResponse("update");
    }
}
