package com.jnshu.hpmybatis.service.impl;

import com.jnshu.hpmybatis.dao.UserMapper;
import com.jnshu.hpmybatis.pojo.User;
import com.jnshu.hpmybatis.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name) {
        return userMapper.selectUser(name);
    }

    @Override
//    传入对象为多个数据，入参封装为一个对象user，传入数据
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return userMapper.deleteUser(id);
    }


    @Override
    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    @Override
    public long insertUser(User user) {
        return userMapper.insertUser(user);
    }

}


