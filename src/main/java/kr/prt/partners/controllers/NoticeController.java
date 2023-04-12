package kr.prt.partners.controllers;

import kr.prt.partners.models.Notice;
import kr.prt.partners.models.NoticeResponse;
import kr.prt.partners.services.NoticeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class NoticeController {

    @Autowired
    private NoticeSerivce noticeSerivce;

    public NoticeController(NoticeSerivce noticeSerivce) {
        this.noticeSerivce = noticeSerivce;
    }

    @RequestMapping(value = "/notice", method = RequestMethod.GET)
    public NoticeResponse NoticeRead() {
        List<Notice> boards = noticeSerivce.read();
        return new NoticeResponse("read", boards);
    }



}
