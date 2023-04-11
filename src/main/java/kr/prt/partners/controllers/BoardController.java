package kr.prt.partners.controllers;

import kr.prt.partners.models.Dashboard;
import kr.prt.partners.services.DashboardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoardController {

    private DashboardSerivce dashboardSerivce;
    @Autowired
    public BoardController(DashboardSerivce dashboardSerivce) {
        this.dashboardSerivce = dashboardSerivce;
    }

//    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
//    public void memberRegi(Locale locale, Model model, String userName, MemberDto dto) {
    @GetMapping("/dashboard/list")
    public String DashboardRe(Model model) {
        List<Dashboard> boards = dashboardSerivce.read();
        System.out.println(boards);
        model.addAttribute("boards", boards);
        return "dashboard/list";
    }

}
