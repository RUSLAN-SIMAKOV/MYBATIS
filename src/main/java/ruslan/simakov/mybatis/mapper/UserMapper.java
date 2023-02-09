package ruslan.simakov.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import ruslan.simakov.mybatis.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from users")
    List<User> findAll();
}
