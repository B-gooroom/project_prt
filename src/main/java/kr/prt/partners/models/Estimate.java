package kr.prt.partners.models;

public class Estimate {

    private Integer rstr_no;
    private String state;
    private Integer user_no;
    private Integer category_top;
    private Integer category_base;
    private Integer brand_no;
    private String brand_name;
    private String note;
    private String use_yn;
    private Integer refuse_cnt;

    public Estimate(Integer rstr_no, String state, Integer user_no, Integer category_top, Integer category_base, Integer brand_no, String brand_name, String note, String use_yn, Integer refuse_cnt) {
        this.rstr_no = rstr_no;
        this.state = state;
        this.user_no = user_no;
        this.category_top = category_top;
        this.category_base = category_base;
        this.brand_no = brand_no;
        this.brand_name = brand_name;
        this.note = note;
        this.use_yn = use_yn;
        this.refuse_cnt = refuse_cnt;
    }

    public Estimate(Integer rstr_no, String state, String note) {
        this.rstr_no = rstr_no;
        this.state = state;
        this.note = note;
    }

    public Integer getRstr_no() {
        return rstr_no;
    }

    public void setRstr_no(Integer rstr_no) {
        this.rstr_no = rstr_no;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCategory_top() {
        return category_top;
    }

    public void setCategory_top(Integer category_top) {
        this.category_top = category_top;
    }

    public Integer getCategory_base() {
        return category_base;
    }

    public void setCategory_base(Integer category_base) {
        this.category_base = category_base;
    }

    public Integer getBrand_no() {
        return brand_no;
    }

    public void setBrand_no(Integer brand_no) {
        this.brand_no = brand_no;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUse_yn() {
        return use_yn;
    }

    public void setUse_yn(String use_yn) {
        this.use_yn = use_yn;
    }

    public Integer getUser_no() {
        return user_no;
    }

    public void setUser_no(Integer user_no) {
        this.user_no = user_no;
    }

    public Integer getRefuse_cnt() {
        return refuse_cnt;
    }

    public void setRefuse_cnt(Integer refuse_cnt) {
        this.refuse_cnt = refuse_cnt;
    }
}
