package com.zouzhu.user_data_download_app_run.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *      Druid 数据源监控
 *
 *      Auther : zouzhu
 *
 *      time : 2019/9/4  13:19
 *
 * **/


@Configuration
public class MyDruidConfiguration {

    @Bean
    public ServletRegistrationBean servletRegistration(){

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");				                // IP 白名单
        servletRegistrationBean.addInitParameter("deny", "192.168.233.135");							// IP 黑名单
        servletRegistrationBean.addInitParameter("loginUsername","2118224692");                       // 用户名
        servletRegistrationBean.addInitParameter("loginPassword", "zouzhu0809");                      // 密码
        servletRegistrationBean.addInitParameter("resetEnter", "false");                              // 是否能够重置数据
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFileter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        // 添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");
        // 忽略过滤的格式
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

}
