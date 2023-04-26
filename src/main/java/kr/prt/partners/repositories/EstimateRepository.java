package kr.prt.partners.repositories;

import kr.prt.partners.models.Estimate;
import kr.prt.partners.models.Suggest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EstimateRepository {

    List<Estimate> readList();

    List<Estimate> readId(Integer rstrNo);

    Integer create(@Param("rstr_no") Integer rstr_no, @Param("state") String state, @Param("user_no") Integer user_no, @Param("note") String note,
                   @Param("input_day") Integer input_day, @Param("price") Integer price, @Param("work_day") Integer work_day);

    List<Suggest> readEstimateList();

    List<Suggest> readEstimate(Integer estimate_no);
}
