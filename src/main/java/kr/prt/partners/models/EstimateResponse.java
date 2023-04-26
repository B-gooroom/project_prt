package kr.prt.partners.models;


import java.util.List;

public class EstimateResponse {

    public String result;
    public List<Estimate> estimateList;

    public EstimateResponse(List<Estimate> estimateList) {
//        this.result = result;
        this.estimateList = estimateList;
    }

    public EstimateResponse(String result) {
        this.result = result;
//        this.estimateList = estimateList;
    }

}
