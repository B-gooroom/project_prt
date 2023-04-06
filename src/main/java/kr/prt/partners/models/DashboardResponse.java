package kr.prt.partners.models;

import java.util.List;

public class DashboardResponse {
    public String result;
    public List<Dashboard> boards;

    public DashboardResponse() {}

    public DashboardResponse(String result) {
        this.result = result;
    }

    public DashboardResponse(String result, List<Dashboard> boards) {
        this.result = result;
        this.boards = boards;
    }
}
