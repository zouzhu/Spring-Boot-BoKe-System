package com.zouzhu.model_jiankong_eureka_service_1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 *      Eureka Services model 负责管理服务提供者模块的 hostname
 *
 *      name : ModelJianKongEurekaService1
 *
 *      time : 2019/9/5  星期四  15:27
 *
 *      Auther : zouzhu
 *
 * **/

@EnableEurekaServer
@EnableEurekaClient
@SpringBootApplication
public class ModelJianKongEurekaService1 {
    /**
     *      我们要说明这是一个 Eureka server 服务管理器, 需要对启动类进行注解
     *
     *      @EnableEurekaServer  @EnableEurekaClient
     *
     *      负责人 : zouzhu
     *
     *      time : 2019/9/5 15:30 星期四
     * **/
    public static void main(String[] args){
        SpringApplication.run(ModelJianKongEurekaService1.class, args);
    }


}
