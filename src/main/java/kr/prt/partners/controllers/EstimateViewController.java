package kr.prt.partners.controllers;

import io.swagger.models.auth.In;
import kr.prt.partners.models.Estimate;
import kr.prt.partners.models.Suggest;
import kr.prt.partners.services.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EstimateViewController {

    private EstimateService estimateService;
    @Autowired
    public EstimateViewController(EstimateService estimateService) {
        this.estimateService = estimateService;
    }

    // estimate 대기
    @GetMapping("/estimate/view")
    public String EstimateView(Model model) {
        List<Estimate> estimateList = estimateService.readList();
        model.addAttribute("estimateList", estimateList);
        return "estimate/view";
    }

    // estimate {id} 확인
    @GetMapping("/estimate/form")
    public String createForm() {
        return "estimate/form";
    }

    @RequestMapping("/estimate/new/{index}")
    public String EstimateForm(@RequestParam("rstr") Integer rstrNo, Model model) {
//        System.out.println(rstrNo);
        List<Estimate> estimateId = estimateService.readId(rstrNo);
//        System.out.println(estimateId.get(0).getUser_no());
        model.addAttribute("estimateId", estimateId);
        return "estimate/new";
    }

    // estimate 견적 제안
    @GetMapping("/estimate/insert")
    public String createInsert() {
        return "estimate/insert";
    }

    @RequestMapping("/estimate/insertnew/{index}")
    public String estimateInsert(@RequestParam("rstr") Integer rstrNo, @RequestParam("note") String note,
                                 @RequestParam("input_day") Integer input_day, @RequestParam("price") Integer price, Model model) {
        Integer work_day = input_day + 7;
        List<Estimate> lists = estimateService.readId(rstrNo);
//        System.out.println(lists.get(0).getUser_no());
        estimateService.create(rstrNo, lists.get(0).getState(), lists.get(0).getUser_no(), note, input_day, price, work_day);
        model.addAttribute("estimateInsert", lists);
        return "estimate/insertnew";
    }

    // 제안한 견적 {id} 확인
    @GetMapping("/estimate/suggestForm")
    public String readEsti() {
        return "estimate/suggestForm";
    }

    @RequestMapping("/estimate/suggest/{index}")
    public String readEstimate(@RequestParam("estimate") Integer estimate_no, Model model) {
        System.out.println(estimate_no);
        List<Suggest> estimateNo = estimateService.readEstimate(estimate_no);
        model.addAttribute("estimateNo", estimateNo);
        return "estimate/suggest";
    }

    // 제안한 견적
    @GetMapping("/suggest/view")
    public String suggestView(Model model) {
        List<Suggest> suggestList = estimateService.readEstimateList();
        model.addAttribute("suggestList", suggestList);
        return "suggest/view";
    }

    // 견적 거절하기
    @GetMapping("/refuse/form")
    public String updateRefuse() {
        return "refuse/form";
    }

    @RequestMapping("/refuse/new/{index}")
    public String refuseForm(@RequestParam("rstr") Integer rstr_no, Model model) {
        System.out.println(rstr_no);
        estimateService.updateRefuse(rstr_no);
        model.addAttribute("refuseNo", rstr_no);
        return "refuse/new";
    }
}
