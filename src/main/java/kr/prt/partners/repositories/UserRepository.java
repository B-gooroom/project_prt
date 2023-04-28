package kr.prt.partners.repositories;

import kr.prt.partners.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRepository {

    List<User> read();

    List<User> find(Integer userNo);

//    Integer create(User user);
    Integer create(@Param("user_id") String user_id, @Param("user_name") String user_name, @Param("user_tel") String user_tel, @Param("user_email") String user_email);

    Integer delete(Integer userNo);

    Integer update(@Param("user_no") Integer userNo, @Param("user_name") String user_name);

}
