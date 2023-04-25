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

    @GetMapping("/estimate/view")
    public String EstimateView(Model model) {
        List<Estimate> estimateList = estimateService.readList();
        model.addAttribute("estimateList", estimateList);
        return "/estimate/view";
    }

    @GetMapping("/estimate/form")
    public String createForm() {
        return "/estimate/form";
    }

    @RequestMapping("/estimate/new/{index}")
    public String EstimateForm(@RequestParam("rstr") Integer rstrNo, Model model) {
//        System.out.println(rstrNo);
        List<Estimate> estimateId = estimateService.readId(rstrNo);
        model.addAttribute("estimateId", estimateId);
        return "/estimate/new";
    }

    @GetMapping("/estimate/insert")
    public String createInsert() {
        return "/estimate/insert";
    }

    @RequestMapping("/estimate/insertnew/{index}")
    public String estimateInsert(@RequestParam("rstr") Integer rstrNo, @RequestParam("note") String note,
                                 @RequestParam("input_day") Integer input_day, @RequestParam("price") Integer price, Model model) {
        Integer work_day = input_day + 7;
        List<Estimate> lists = estimateService.readId(rstrNo);
        estimateService.create(rstrNo, lists.get(0).getState(), note, input_day, price, work_day);
        model.addAttribute("estimateInsert", lists);
        return "/estimate/insertnew";
    }

    @GetMapping("/estimate/suggestForm")
    public String readEsti() {
        return "/estimate/suggestForm";
    }

    @RequestMapping("/estimate/suggest/{index}")
    public String readEstimate(@RequestParam("estimate") Integer estimate_no, Model model) {
        System.out.println(estimate_no);
        List<Suggest> estimateNo = estimateService.readEstimate(estimate_no);
        model.addAttribute("estimateNo", estimateNo);
        return "/estimate/suggest";
    }

    @GetMapping("/suggest/view")
    public String suggestView(Model model) {
        List<Suggest> suggestList = estimateService.readEstimateList();
        model.addAttribute("suggestList", suggestList);
        return "/suggest/view";
    }
}