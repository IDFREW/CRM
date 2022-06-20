package com.ex20.CRM.settings.dao;

import com.ex20.CRM.settings.bean.User;

/**
 * 创建时间: 2022-03-24 14:49<hr/>
 *
 * @author 高诚政
 * @version 1.0
 */
public interface UserDao {
    /**
     * 使用账号与密码查询数据库中数据
     * @param user 将数据封装为一个对象
     * @return 返回的数据封装为一个User
     */
    User selectUser(User user);
}
