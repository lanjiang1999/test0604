package com.jt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user")
    List<User> findAll();

    void insertUser(User user);
}
