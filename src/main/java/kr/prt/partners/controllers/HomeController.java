package kr.prt.partners.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("api/v2")
public class HomeController {

//    @GetMapping("/")
//    public String hello(Dashboard dashboard) {
//        dashboard.addAttribute("data", "hello!");
//        return "hello";
//    }

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
