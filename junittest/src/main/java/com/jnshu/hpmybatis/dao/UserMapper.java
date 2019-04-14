package com.jnshu.hpmybatis.dao;

import com.jnshu.hpmybatis.pojo.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;
//通过mapper提供一些通用方法，这些通用方法是以接口形式提供的
public interface UserMapper {
//在方法参数的前面写上@Param("参数名"),表示给参数命名,名称就是括号中的内容
    User selectUser(@Param("username") String username);

    List<User> selectAll();

    boolean deleteUser(@Param("id") Integer id);

    boolean updateUser(User user);
//Long（返回值类型）insertUser方法名（User传入参数的数据类型 user自定名字）
    Long insertUser(User user);

}
