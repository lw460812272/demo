package com.liwei.model;

import lombok.Data;

/**
 * @ Author     ：weili
 * @ Date       ：2018/11/4 0:10
 * @ Modified By：
 * @Version:
 */
@Data
public class User {
    // 主键
    private Long id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;
}
