package kr.prt.partners.models;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class Dashboard {

    private Integer board_no;
    private Integer board_seq;
    private Integer board_cat;
    private BigInteger num;
    private String subject;
    private String content;

    public Dashboard(Integer board_no) {
        this.board_no = board_no;
    }

    public Dashboard(Integer board_no, Integer board_seq, Integer board_cat, BigInteger num, String subject, String content) {
        this.board_no = board_no;
        this.board_seq = board_seq;
        this.board_cat = board_cat;
        this.num = num;
        this.subject = subject;
        this.content = content;
    }

    public Integer getBoard_no() {
        return board_no;
    }

    public void setBoard_no(Integer board_no) {
        this.board_no = board_no;
    }

    public Integer getBoard_seq() {
        return board_seq;
    }

    public void setBoard_seq(Integer board_seq) {
        this.board_seq = board_seq;
    }

    public Integer getBoard_cat() {
        return board_cat;
    }

    public void setBoard_cat(Integer board_cat) {
        this.board_cat = board_cat;
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
