package kr.prt.partners.repositories;

import kr.prt.partners.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRepository {

    List<User> read();

    List<User> find(Integer userNo);

    Integer create(User user);

    Integer delete(Integer userNo);

//    Integer update(Integer userPk, String user_name);
//    Integer update(Integer userPk, User user);
    Integer update(@Param("user_no") Integer userNo, @Param("user_name") String user_name);

}
