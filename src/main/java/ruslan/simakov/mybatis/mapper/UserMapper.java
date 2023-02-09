package ruslan.simakov.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import ruslan.simakov.mybatis.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    List<User> findAll();

    @Insert("INSERT INTO users(name) values(#{name})")
    @SelectKey(statement = "CALL SCOPE_IDENTITY()", keyProperty = "id",
            before = false, resultType = Long.class)
    void addUser(User user);
}
