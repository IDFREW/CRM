package com.ex20.CRM.settings.service.impl;

import com.ex20.CRM.settings.dao.UserDao;
import com.ex20.CRM.settings.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 创建时间: 2022-03-24 14:52<hr/>
 *
 * @author 高诚政
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
}
