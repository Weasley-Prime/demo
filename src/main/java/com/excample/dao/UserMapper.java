package com.example.dao;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.*;

public interface UserMapper {
    List<User> getUsers();
    void addUser(User user);
    void delUser(Integer id);
    User getUser(Integer id);
    @Select("select * from User where id = #{id}")
    User getUserById(@Param("id")Integer id);
    void updataUser(User user);
    List<User> getUsersByLimit(Map<String,Integer> map);
}
