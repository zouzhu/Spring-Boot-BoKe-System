package com.zouzhu.user_view_display_model.cache;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 *      描述 : 该模块主要负责查询用户的缓存信息, 验证登录状态一系列事情
 *
 *      author : zouzhu
 *
 *      time : 2019/9/20  11:30
 * **/
public class UserMessageCache {



    @Autowired
    private RedisTemplate redisTemplate;



    public Boolean authenticationUserState(String name, String password){
        /*
        *       描述 : 从缓存中查询用户名和密码是否正确, 如果正确返回 true, 否则返回 false, 如果为空返回 null
        *
        *       author : zouzhu
        *
        *       time : 2019/9/20   16:39
        * */
        return true;
    }
}
