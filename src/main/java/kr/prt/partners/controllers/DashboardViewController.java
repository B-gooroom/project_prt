package kr.prt.partners.controllers;

import kr.prt.partners.models.Dashboard;
import kr.prt.partners.services.DashboardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DashboardViewController {

    private DashboardSerivce dashboardSerivce;
    @Autowired
    public DashboardViewController(DashboardSerivce dashboardSerivce) {
        this.dashboardSerivce = dashboardSerivce;
    }

//    @GetMapping("/dashboard")
//    public Object DashboardView(Model model) {
//        Map<String, Object> results = new HashMap<>();
//        List<Dashboard> ongoing = dashboardSerivce.cntOngoing();
//        List<Dashboard> notice = dashboardSerivce.cntNotice();
//        List<Dashboard> notification = dashboardSerivce.cntNotification();
//        List<Dashboard> restoration = dashboardSerivce.cntRestoration();
//        results.put("notice", notice.get(0).getCount());
//        results.put("notification", notification.get(0).getCount());
//        results.put("restoration", restoration.get(0).getCount());
//        results.put("ongoing", ongoing.get(0).getCount());
//        System.out.println(results);
//        model.addAttribute("dashboard", results);
//        return "/dashboard";
//    }

//    @GetMapping("/dashboard")
//    public Object DashView(Model model) {
//
//        class Order {
//            int notification;
//            int notice;
//            int restoration;
//            int ongoing;
//        }
//        Order obj1 = new Order();
//
//        // list 바로 model.addAttribute ?
//        List<Dashboard> notification = dashboardSerivce.cntNotification();
//        List<Dashboard> notice = dashboardSerivce.cntNotice();
//        List<Dashboard> restoration = dashboardSerivce.cntRestoration();
//        List<Dashboard> ongoing = dashboardSerivce.cntOngoing();
////        model.addAttribute("notification", notification.get(0).getCount());
////        model.addAttribute("notice", notice.get(0).getCount());
////        model.addAttribute("restoration", restoration.get(0).getCount());
////        model.addAttribute("ongoing", ongoing.get(0).getCount());
//
//        // object ?
//        obj1.notification = notification.get(0).getCount();
//        obj1.notice = notice.get(0).getCount();
//        obj1.restoration = restoration.get(0).getCount();
//        obj1.ongoing = ongoing.get(0).getCount();
//        model.addAttribute("notification", obj1.notification);
//        model.addAttribute("notice", obj1.notice);
//        model.addAttribute("restoration", obj1.restoration);
//        model.addAttribute("ongoing", obj1.ongoing);
//        return "/dashboard";
//    }

//    @GetMapping("/dashboard")
//    public Object DashView(Model model) {
//        List<Dashboard> ongoing = dashboardSerivce.cntOngoing();
//        model.addAttribute("dashboard", ongoing.get(0));
//        return "/dashboard";
//    }

    @GetMapping("/dashboard")
    public Object Dash(Model model) {
        Map<String, Object> result = new HashMap<>();
        List<Dashboard> notification = dashboardSerivce.cntNotification();
        List<Dashboard> notice = dashboardSerivce.cntNotice();
        List<Dashboard> restoration = dashboardSerivce.cntRestoration();
        List<Dashboard> ongoing = dashboardSerivce.cntOngoing();
        result.put("notification", notification.get(0).getCount());
        result.put("notice", notice.get(0).getCount());
        result.put("restoration", restoration.get(0).getCount());
        result.put("ongoing", ongoing.get(0).getCount());
        System.out.println(result);
        model.addAttribute("dash", result);
        return "dashboard";
    }

}
