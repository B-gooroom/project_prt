package kr.prt.partners.controllers;

import io.swagger.models.auth.In;
import kr.prt.partners.models.Estimate;
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

}
