package kr.prt.partners.repositories;

import kr.prt.partners.models.Dashboard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DashboardRepository {

    List<Dashboard> restoration();

    List<Dashboard> notification();

    List<Dashboard> notice();

    List<Dashboard> ongoing();
}