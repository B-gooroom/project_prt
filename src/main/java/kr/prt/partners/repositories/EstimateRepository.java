package kr.prt.partners.repositories;

import kr.prt.partners.models.Estimate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EstimateRepository {

    List<Estimate> readList();

    List<Estimate> readId(Integer rstrNo);

    Integer create(@Param("rstr_no") Integer rstr_no, @Param("state") String state, @Param("note") String note, @Param("contract_yn") String contract_yn);
//    Integer create(Estimate estimate);
}
