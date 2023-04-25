package kr.prt.partners.controllers;

import kr.prt.partners.models.Estimate;
import kr.prt.partners.models.EstimateResponse;
import kr.prt.partners.services.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class EstimateController {

    private EstimateService estimateService;
    @Autowired
    public EstimateController(EstimateService estimateService) {
        this.estimateService = estimateService;
    }

    @RequestMapping(path = "/estimate", method = RequestMethod.GET)
    public EstimateResponse readList() {
        List<Estimate> lists = estimateService.readList();
//        System.out.println(lists);
//        return new EstimateResponse(lists);
        return new EstimateResponse(lists);
    }

    @RequestMapping(path = "/estimate/{index}", method = RequestMethod.GET)
    public EstimateResponse readId(Integer rstrNo) {
        List<Estimate> lists = estimateService.readId(rstrNo);
//        System.out.println(lists);
//        return new EstimateResponse(lists);
        return new EstimateResponse(lists);
    }

    @RequestMapping(path = "/estimate", method = RequestMethod.POST)
    public EstimateResponse create(Integer rstr_no, String note, Integer input_day, Integer price) {
//        estimateService.insert(rstr_no, state, note);
        List<Estimate> lists = estimateService.readId(rstr_no);
//        System.out.println(lists.get(0).getState());
//        System.out.println(lists.get(0));
        Integer work_day = input_day + 7;
        estimateService.create(rstr_no, lists.get(0).getState(), note, input_day, price, work_day);
        return new EstimateResponse(lists);
    }

//    @RequestMapping(path = "/estimate", method = RequestMethod.POST)
//    public EstimateResponse create(Estimate estimate) {
////        estimateService.insert(rstr_no, state, note);
//        System.out.println(estimate);
//        estimateService.create(estimate);
//        return new EstimateResponse("create");
//    }
}
