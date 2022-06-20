package com.ex20.CRM.exception;

/**
 * 创建时间: 2022-03-24 15:27<hr/>
 * 登录失败异常
 * @author 高诚政
 * @version 1.0
 */
public class LoginException extends CrmException{
    public LoginException() {
        super();
    }

    public LoginException(String message) {
        super(message);
    }
}
