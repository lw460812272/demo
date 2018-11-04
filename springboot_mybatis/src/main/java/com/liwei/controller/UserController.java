package com.liwei.controller;

import com.liwei.mapper.UserMapper;
import com.liwei.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ Author     ：weili
 * @ Date       ：2018/11/4 0:19
 * @ Modified By：
 * @Version:
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
