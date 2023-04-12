package kr.prt.partners.models;

import java.util.List;

public class NotificationResponse {

    public String result;

    public List<Notification> notifications;

    public NotificationResponse(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public NotificationResponse(String result) {
        this.result = result;
    }
//    public NotificationResponse(String result, List<Notification> notifications) {
//        this.result = result;
//        this.notifications = notifications;
//    }
}
