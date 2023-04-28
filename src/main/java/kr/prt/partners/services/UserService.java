package kr.prt.partners.services;

import kr.prt.partners.models.User;
import kr.prt.partners.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> userRead() {
        return userRepository.read();
    }

    public List<User> find(Integer userNo) {
        return userRepository.find(userNo);
    }

//    public Integer create(User user) {
//        return userRepository.create(user);
//    }

    public Integer create(String user_id, String user_name, String user_tel, String user_email) {
        return userRepository.create(user_id, user_name, user_tel, user_email);
    }
    public Integer delete(Integer userNo) {
        return userRepository.delete(userNo);
    }

    public Integer update(Integer userNo, String user_name) {
        return userRepository.update(userNo, user_name);
    }
}
