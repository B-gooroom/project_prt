package kr.prt.partners.controllers;

import kr.prt.partners.models.Dashboard;
import kr.prt.partners.services.DashboardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class DashboardController {

    @Autowired
    private DashboardSerivce dashboardSerivce;

    public DashboardController(DashboardSerivce dashboardSerivce) {
        this.dashboardSerivce = dashboardSerivce;
    }

    /**견적 대기 count */
//    @RequestMapping(path = "/restorations", method = RequestMethod.GET)
//    public CountResponse Restoration() {
//        List<Count> cnt = countSerivce.cntRestoration();
//        return new CountResponse(cnt);
//    }

    /**알림 count */
//    @RequestMapping(path = "/notification", method = RequestMethod.GET)
//    public CountResponse Notification() {
//        List<Count> cnt = countSerivce.cntNotification();
//        return new CountResponse(cnt);
//    }

    /**공지사항 count */
//    @RequestMapping(path = "/notice", method = RequestMethod.GET)
//    public CountResponse Notice() {
//        List<Count> cnt = countSerivce.cntNotice();
//        return new CountResponse(cnt);
//    }

    /**진행중인 수선 count */
//    @RequestMapping(path = "/ongoing", method = RequestMethod.GET)
//    public CountResponse Ongoing() {
//        List<Count> cnt = countSerivce.cntOngoing();
//        return new CountResponse(cnt);
//    }

    /**전체 count */
    @RequestMapping(path = "/dashboard", method = RequestMethod.GET)
    public Object Dashboard() {
        Map<String, Object> results = new HashMap<>();
        List<Dashboard> ongoing = dashboardSerivce.cntOngoing();
        List<Dashboard> notice = dashboardSerivce.cntNotice();
        List<Dashboard> notification = dashboardSerivce.cntNotification();
        List<Dashboard> restoration = dashboardSerivce.cntRestoration();
        results.put("notice", notice.get(0).getCount());
        results.put("notification", notification.get(0).getCount());
        results.put("restoration", restoration.get(0).getCount());
        results.put("ongoing", ongoing.get(0).getCount());
        System.out.println(results);
        return results;
    }
}
