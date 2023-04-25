package kr.prt.partners.models;


public class Suggest {

    private Integer estimate_no;
    private Integer rstr_no;
    private String state;
    private String note;
    private Integer input_day;
    private Integer work_price;
    private String register_time;
    private String contract_yn;

    public Suggest(Integer estimate_no, Integer rstr_no, String state, String note, Integer input_day, Integer work_price, String register_time) {
        this.estimate_no = estimate_no;
        this.rstr_no = rstr_no;
        this.state = state;
        this.note = note;
        this.input_day = input_day;
        this.work_price = work_price;
        this.register_time = register_time;
    }

    public Suggest(Integer estimate_no, Integer rstr_no, String state, String note, Integer input_day, Integer work_price, String register_time, String contract_yn) {
        this.estimate_no = estimate_no;
        this.rstr_no = rstr_no;
        this.state = state;
        this.note = note;
        this.input_day = input_day;
        this.work_price = work_price;
        this.register_time = register_time;
        this.contract_yn = contract_yn;
    }

    public Integer getEstimate_no() {
        return estimate_no;
    }

    public Integer getRstr_no() {
        return rstr_no;
    }

    public String getState() {
        return state;
    }

    public String getNote() {
        return note;
    }

    public Integer getInput_day() {
        return input_day;
    }

    public Integer getWork_price() {
        return work_price;
    }

    public String getRegister_time() {
        return register_time;
    }

    public String getContract_yn() {
        return contract_yn;
    }
}
