package com.hyp.learn.security.hb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hyp
 * Project name is learn-security
 * Include in com.hyp.learn.security.hb.controller
 * hyp create at 19-12-30
 **/
@Controller
public class MainController {

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/userLogin")
    public String login(){
        return "login";
    }

    /**
     * 错误页面
     * @return
     */
    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
