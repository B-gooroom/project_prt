package kr.prt.partners.models;

public class User {

    private Integer user_no;
    private String user_id;
    private String user_name;
    private String register_time;
    private String user_tel;
    private String user_email;
    private String post;
    private String user_addr;
    private String user_addr_det;

//    public User(Integer user_no, String user_id, String user_name, String register_time, String user_tel, String user_email) {
//        this.user_no = user_no;
//        this.user_id = user_id;
//        this.user_name = user_name;
//        this.register_time = register_time;
//        this.user_tel = user_tel;
//        this.user_email = user_email;
//    }


    public User(Integer user_no, String user_id, String user_name) {
        this.user_no = user_no;
        this.user_id = user_id;
        this.user_name = user_name;
    }

    public User(Integer user_no, String user_id, String user_name, String register_time, String user_tel, String user_email, String post, String user_addr, String user_addr_det) {
        this.user_no = user_no;
        this.user_id = user_id;
        this.user_name = user_name;
        this.register_time = register_time;
        this.user_tel = user_tel;
        this.user_email = user_email;
        this.post = post;
        this.user_addr = user_addr;
        this.user_addr_det = user_addr_det;
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

    public String getRegister_time() {
        return register_time;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getPost() {
        return post;
    }

    public String getUser_addr() {
        return user_addr;
    }

    public String getUser_addr_det() {
        return user_addr_det;
    }
}
