package kr.prt.partners.repositories;

import kr.prt.partners.models.Restoration;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RestorationRepository {

    List<Restoration> read();
}
