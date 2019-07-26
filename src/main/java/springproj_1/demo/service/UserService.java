package springproj_1.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import springproj_1.demo.mapper.UserMapper;
import springproj_1.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }
}
