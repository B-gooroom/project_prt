package kr.prt.partners.repositories;

import kr.prt.partners.models.Dashboard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DashboardRepository {

//    (select * from lxNoticeAdmin)
    List<Dashboard> read();
}
