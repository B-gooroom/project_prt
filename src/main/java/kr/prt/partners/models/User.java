package kr.prt.partners.models;

public class User {

    private Integer user_no;
    private String user_id;
    private String user_name;

    public User(Integer user_no, String user_id, String user_name) {
        this.user_no = user_no;
        this.user_id = user_id;
        this.user_name = user_name;
    }

    public Integer getUser_no() {
        return user_no;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }
}
