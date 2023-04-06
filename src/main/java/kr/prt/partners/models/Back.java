package kr.prt.partners.models;

import java.time.LocalDateTime;

public class Back {

    private Integer userNo;
    private String userId;
    private String userPw;
    private String userName;
    private String userEmail;
    private LocalDateTime joinTime;
    private String flagLock;
    private String flagHistory;

    public Back(Integer userNo, String userId) {
        this.userNo = userNo;
        this.userId = userId;
    }

    public Back(Integer userNo, String userId, String userPw, String userName, String userEmail, LocalDateTime joinTime, String flagLock, String flagHistory) {
        this.userNo = userNo;
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.userEmail = userEmail;
        this.joinTime = joinTime;
        this.flagLock = flagLock;
        this.flagHistory = flagHistory;
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDateTime getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(LocalDateTime joinTime) {
        this.joinTime = joinTime;
    }

    public String getFlagLock() {
        return flagLock;
    }

    public void setFlagLock(String flagLock) {
        this.flagLock = flagLock;
    }

    public String getFlagHistory() {
        return flagHistory;
    }

    public void setFlagHistory(String flagHistory) {
        this.flagHistory = flagHistory;
    }

}
