package ruslan.simakov.mybatis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ruslan.simakov.mybatis.mapper.UserMapper;
import ruslan.simakov.mybatis.model.User;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserMapper userMapper;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userMapper.findAll();
    }
}
