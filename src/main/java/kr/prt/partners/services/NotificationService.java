package kr.prt.partners.services;

import kr.prt.partners.models.Notification;
import kr.prt.partners.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;
    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> read() {
        return notificationRepository.read();
    }

    public List<Notification> unread() {
        return notificationRepository.unread();
    }

    public Integer readNoti(Integer notiNo) {
        return notificationRepository.readNoti(notiNo);
    }

    public Integer allRead(Integer notiNo) {
        boolean result = notiNo.equals(0);
        System.out.println(result);
        if (result) {
            return notificationRepository.allRead(notiNo);
        } else {
            return null;
        }
    }
}
