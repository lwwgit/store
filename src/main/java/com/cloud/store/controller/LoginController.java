package com.cloud.store.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @Autowired
    HttpServletRequest request;


    @RequestMapping(value = "/loginPage")
    public String loginPage(){
        return "login.html" ;
    }



}
