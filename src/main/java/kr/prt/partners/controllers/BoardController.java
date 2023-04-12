package kr.prt.partners.controllers;

import kr.prt.partners.models.Notice;
import kr.prt.partners.services.NoticeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoardController {

    private NoticeSerivce noticeSerivce;
    @Autowired
    public BoardController(NoticeSerivce noticeSerivce) {
        this.noticeSerivce = noticeSerivce;
    }

//    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
//    public void memberRegi(Locale locale, Model model, String userName, MemberDto dto) {
    @GetMapping("/notice/list")
    public String DashboardRe(Model model) {
        List<Notice> boards = noticeSerivce.read();
        System.out.println(boards);
        model.addAttribute("boards", boards);
        return "notice/list";
    }

}
