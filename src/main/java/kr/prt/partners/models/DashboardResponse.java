package kr.prt.partners.models;

import java.util.List;

public class DashboardResponse {

//    public List<Count> result;
    public List<Dashboard> dashboard;

    public DashboardResponse(List<Dashboard> dashboard) {
//        this.result = result;
        this.dashboard = dashboard;
    }
//    public CountResponse(String result, List<Count> cnts) {
//        this.result = result;
//        this.cnts = cnts;
//    }
}
