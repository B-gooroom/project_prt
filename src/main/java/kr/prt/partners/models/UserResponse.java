package kr.prt.partners.models;

import java.util.List;

public class UserResponse {

    public String result;

    public List<User> users;

    public UserResponse(String result) {
//        System.out.println(result);
        this.result = result;
    }

    public UserResponse(String result, List<User> users) {
        this.result = result;
        this.users = users;
    }
}
