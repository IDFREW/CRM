package com.ex20.CRM.settings.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 创建时间: 2022-03-24 14:56<hr/>
 *
 * @author 高诚政
 * @version 1.0
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("save.do")
    public ModelAndView userLogin(){

        return new ModelAndView();
    }
}
