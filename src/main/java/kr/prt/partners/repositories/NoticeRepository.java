package kr.prt.partners.repositories;

import kr.prt.partners.models.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeRepository {

//    (select * from lxNoticeAdmin)
    List<Notice> read();
}


