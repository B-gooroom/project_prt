package kr.prt.partners.repositories;

import kr.prt.partners.models.Notification;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NotificationRepository {

    List<Notification> read();

    List<Notification> unread();

    Integer readNoti(@Param("noti_no") Integer notiNo);
//    Integer update(Integer noti_no);

    Integer allRead(@Param("noti_no") Integer notiNo);
}
