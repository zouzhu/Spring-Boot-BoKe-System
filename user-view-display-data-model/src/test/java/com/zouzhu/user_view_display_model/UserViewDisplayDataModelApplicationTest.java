package com.zouzhu.user_view_display_model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebListener
public class UserViewDisplayDataModelApplicationTest implements ServletContextListener {

    @Autowired
    private RedisTemplate redisTemplate;

    private final static String ALL_USER = "ALL_USER_LIST";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /*
         *       将我们的用户数据存放到 Redis 缓存中
         *
         *       Auther: zouzhu
         *
         *       time: 2019/9/10   0:42
         * */
        List<String> userList = Arrays.asList("张一山", "马化腾", "张柏芝");                                // 1. 查询数据库中所有用户数据

        redisTemplate.delete(ALL_USER);                                                                    // 2. 清除缓存中的用户数据

        redisTemplate.opsForList().leftPushAll(ALL_USER, userList);                                        // 3. 将新数据放入缓存

        List<String> queryUserList = redisTemplate.opsForList().range(ALL_USER, 0 , - 1);           // 4. 查询 Redis 中 ALL_USER_LIST

        System . out . println("缓存中目前的用户数有：" + queryUserList.size() + " 人 ");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}