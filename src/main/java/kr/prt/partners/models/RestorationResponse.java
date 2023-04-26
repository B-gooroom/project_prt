package kr.prt.partners.models;

import java.util.List;

public class RestorationResponse {

    public String result;
    public List<Restoration> lists;

    public RestorationResponse(String result, List<Restoration> lists) {
        this.result = result;
        this.lists = lists;
    }

    public RestorationResponse(String result) {
        this.result = result;
    }
}
