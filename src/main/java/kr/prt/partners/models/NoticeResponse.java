package kr.prt.partners.models;

import java.util.List;

public class NoticeResponse {
    public String result;
    public List<Notice> boards;

    public NoticeResponse() {}

    public NoticeResponse(String result) {
        this.result = result;
    }

    public NoticeResponse(String result, List<Notice> boards) {
        this.result = result;
        this.boards = boards;
    }
}
