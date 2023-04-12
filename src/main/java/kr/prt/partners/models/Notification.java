package kr.prt.partners.models;

public class Notification {

    private Integer noti_no;
    private String noti_type;
    private String noti_title;
    private String noti_content;
    private String flag_read;
    private String read_time;
    private String register_time;

    public Notification(Integer noti_no, String noti_type, String noti_title, String noti_content, String flag_read, String read_time, String register_time) {
        this.noti_no = noti_no;
        this.noti_type = noti_type;
        this.noti_title = noti_title;
        this.noti_content = noti_content;
        this.flag_read = flag_read;
        this.read_time = read_time;
        this.register_time = register_time;
    }

    public Integer getNoti_no() {
        return noti_no;
    }

    public void setNoti_no(Integer noti_no) {
        this.noti_no = noti_no;
    }

    public String getNoti_type() {
        return noti_type;
    }

    public void setNoti_type(String noti_type) {
        this.noti_type = noti_type;
    }

    public String getNoti_title() {
        return noti_title;
    }

    public void setNoti_title(String noti_title) {
        this.noti_title = noti_title;
    }

    public String getNoti_content() {
        return noti_content;
    }

    public void setNoti_content(String noti_content) {
        this.noti_content = noti_content;
    }

    public String getFlag_read() {
        return flag_read;
    }

    public void setFlag_read(String flag_read) {
        this.flag_read = flag_read;
    }

    public String getRead_time() {
        return read_time;
    }

    public void setRead_time(String read_time) {
        this.read_time = read_time;
    }

    public String getRegister_time() {
        return register_time;
    }

    public void setRegister_time(String register_time) {
        this.register_time = register_time;
    }
}
