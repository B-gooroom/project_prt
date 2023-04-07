package kr.prt.partners.repositories;

import kr.prt.partners.models.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {

    List<User> read();
}
