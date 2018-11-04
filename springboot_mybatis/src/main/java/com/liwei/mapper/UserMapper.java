package com.liwei.mapper;

import com.liwei.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ Author     ：weili
 * @ Date       ：2018/11/4 0:18
 * @ Modified By：
 * @Version:
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
