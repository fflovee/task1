package com.jnshu.hpmybatis.service;

import com.jnshu.hpmybatis.pojo.User;
import java.util.List;

//service类：

public interface UserService {
//  User 返回值类型就是User类
    User getUserByName(String name);
//  int id 根据id修改，根据参数修改
    boolean updateUser(User user);

    boolean deleteUser(int id);

    List<User> selectAll();

    long insertUser(User user);
}
