package kr.prt.partners.controllers;

import kr.prt.partners.models.User;
import kr.prt.partners.models.UserResponse;
import kr.prt.partners.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    // user 확인
    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public UserResponse users() {
        List<User> users = userService.userRead();
//        System.out.println(users);
        return new UserResponse("read", users);
    }

    // user {id} 확인
    @RequestMapping(path = "/user/{index}", method = RequestMethod.GET)
    public UserResponse find(Integer userNo) {
        List<User> find = userService.find(userNo);
        System.out.println(find);
        return new UserResponse("find", find);
//        return new UserResponse("find", userNo);
    }

    // user create (회원가입)
//    @RequestMapping(path = "/user", method = RequestMethod.POST)
//    public UserResponse create(User user) {
//        userService.create(user);
////        userRepository.create(user);
//        return new UserResponse("create");
//    }
    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public UserResponse create(String user_id, String user_name, String user_tel, String user_email) {
        System.out.println(user_email);
        userService.create(user_id, user_name, user_tel, user_email);
        return new UserResponse("create");
    }

    // user delete (회원탈퇴)
    @RequestMapping(path = "/user/{index}", method = RequestMethod.DELETE)
    public UserResponse delete(@PathVariable("index") int index) {
        userService.delete(index);
        return new UserResponse("delete");
    }

    // user 정보 변경
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

    // mvc -> form 이나 axios 연결로 구현
//    @RequestMapping(path = "/login/{index}", method = RequestMethod.GET)
//    public UserResponse login(Integer userNo, HttpServletRequest request) {
//        List<User> find = userService.find(userNo);
//        System.out.println(find);
//        request.getSession().setAttribute("id", find.get(0).getUser_no());
//        return new UserResponse("find", find);
//    }
}
