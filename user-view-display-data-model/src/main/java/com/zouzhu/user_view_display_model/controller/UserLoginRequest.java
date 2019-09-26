package com.zouzhu.user_view_display_model.controller;


import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserLoginRequest {


    /**
     *          描述 : 该模块主要负责登录的一系列请求工作, 并完成登录效验和用户缓存
     *
     *          Auther : zouzhu
     *
     *          time : 2019/9/17  8:53
     *
     * **/

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST , value = {"/user/login"})
    public String loginInitRequestAdder(@Param("username") String username, @Param("password") String password){
        /**
         *      描述 : 用户提交登录按钮时, 第一次访问的链接, 用于初始化用户名和密码的效验工作
         *
         *      Auther : zouzhu
         *
         *      time : 2019/9/17
         * **/

        // 预留缓存查询


        if (true){

        }else {
            // 重定向到登录页
        }
        System.out.println("username : " + username + " password : " + password);

        return "用户名密码初始化通过 !";


    }
}
