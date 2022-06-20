package com.ex20.CRM.exception.handler;

import com.ex20.CRM.exception.LoginException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 创建时间: 2022-03-24 15:30<hr/>
 *
 * @author 高诚政
 * @version 1.0
 */
@ControllerAdvice
public class CrmExceptionHandler {
    @ExceptionHandler(LoginException.class)
    public ModelAndView logInException(Exception ex){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","登录失败,账号或密码错误");
        mv.setViewName("");
        return mv;
    }
    @ExceptionHandler
    public ModelAndView exception(Exception ex){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","系统出现异常,请联系管理员或登录管理员账号");
        mv.addObject("ex",ex.getMessage());
        mv.setViewName("");
        return mv;
    }
}
