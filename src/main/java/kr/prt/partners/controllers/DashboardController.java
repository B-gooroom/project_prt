package kr.prt.partners.controllers;

import kr.prt.partners.models.Dashboard;
import kr.prt.partners.models.DashboardResponse;
import kr.prt.partners.services.DashboardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class DashboardController {

    @Autowired
    private DashboardSerivce dashboardSerivce;

    public DashboardController(DashboardSerivce dashboardSerivce) {
        this.dashboardSerivce = dashboardSerivce;
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public DashboardResponse DashboardRead() {
        List<Dashboard> boards = dashboardSerivce.read();
        return new DashboardResponse("read", boards);
    }

//    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
//    public Dashboard Dashboard() {
//        List<Dashboard> dashboards = dashboardSerivce.read();
//        return new Dashboard(1);
//    }

}
