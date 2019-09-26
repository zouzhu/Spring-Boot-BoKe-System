package com.zouzhu.user_view_display_model;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 *       描述 : 对于用户的请求做出分析, 向其他的服务提供者模块发起请求, 并将得到的数据展示给用户
 *
 *       Auther : zouzhu
 *
 *       time : 2019/9/9 15:15
 * **/


@SpringBootApplication
@ServletComponentScan
public class UserViewDisplayDataModelApplication {

    public static void main(String[] args){
        SpringApplication.run(UserViewDisplayDataModelApplication.class, args);
    }
}