package kr.prt.partners.models;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class Dashboard {

    private Integer baord_no;
    private Integer baord_seq;
    private Integer baord_cat;
    private BigInteger num;
    private String subject;
    private String content;

    public Dashboard(Integer baord_no) {
        this.baord_no = baord_no;
    }

    public Dashboard(Integer baord_no, Integer baord_seq, Integer baord_cat, BigInteger num, String subject, String content) {
        this.baord_no = baord_no;
        this.baord_seq = baord_seq;
        this.baord_cat = baord_cat;
        this.num = num;
        this.subject = subject;
        this.content = content;
    }

    public Integer getBaord_no() {
        return baord_no;
    }

    public void setBaord_no(Integer baord_no) {
        this.baord_no = baord_no;
    }

    public Integer getBaord_seq() {
        return baord_seq;
    }

    public void setBaord_seq(Integer baord_seq) {
        this.baord_seq = baord_seq;
    }

    public Integer getBaord_cat() {
        return baord_cat;
    }

    public void setBaord_cat(Integer baord_cat) {
        this.baord_cat = baord_cat;
    }

    public BigInteger getNum() {
        return num;
    }

    public void setNum(BigInteger num) {
        this.num = num;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
