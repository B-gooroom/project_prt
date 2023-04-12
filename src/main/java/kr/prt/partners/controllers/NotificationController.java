package kr.prt.partners.controllers;

import kr.prt.partners.models.Notification;
import kr.prt.partners.models.NotificationResponse;
import kr.prt.partners.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping(path = "/notification", method = RequestMethod.GET)
    public NotificationResponse NotiRead() {
        List<Notification> read = notificationService.read();
        return new NotificationResponse(read);
    }

    @RequestMapping(path = "/notification/unread", method = RequestMethod.GET)
    public NotificationResponse NotiUnread() {
        List<Notification> unread = notificationService.unread();
        return new NotificationResponse(unread);
    }

    @RequestMapping(path = "/notification/readNoti/{index}", method = RequestMethod.PATCH)
    public NotificationResponse readNoti(@PathVariable("index") int index) {
        notificationService.readNoti(index);
        return new NotificationResponse("update");
//        return new NotificationResponse(index);
    }
    
    @RequestMapping(path = "/notification/allRead/{index}", method = RequestMethod.PATCH)
    public NotificationResponse allRead(@PathVariable("index") int index) {
        notificationService.allRead(index);
        System.out.println(index);
        return new NotificationResponse("update All");
    }
}
