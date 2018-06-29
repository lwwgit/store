package com.cloud.store.controller;

import com.cloud.store.domain.entity.Msg;
import com.cloud.store.domain.entity.SysUser;
import com.cloud.store.service.RegisterService;
import com.cloud.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author jitdc
 * @Date Create in 13:59 2018/6/29
 * @Description: 用户注册
 */
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    /**
     * @Author: jitdc
     * @Date: 14:12 2018/6/29
     * @Description: 判断用户名是否已存在
     */
    @PostMapping("/register")
    public Msg<?> UserRegister(SysUser user){
        int i = registerService.usernameIsExist(user.getUsername());
        if (i == 1)
            return new Msg<>(Msg.ERROR,"用户名已存在",null);
        else{
            user.setCreateDate(new Date());
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            int insert = userService.insert(user);
            if (insert == 1)
                return new Msg<>(Msg.OK,"注册成功",null);
            else
                return new Msg<>(Msg.ERROR,"注册失败",null);
        }

    }
}
