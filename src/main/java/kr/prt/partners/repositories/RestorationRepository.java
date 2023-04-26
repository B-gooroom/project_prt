package kr.prt.partners.repositories;

import kr.prt.partners.models.Restoration;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RestorationRepository {

    List<Restoration> read();

   Integer create(@Param("category_top") Integer category_top, @Param("category_base") Integer category_base,
                             @Param("brand_no") Integer brand_no, @Param("brand_name") String brand_name, @Param("note") String note, @Param("id") Integer id);
}
