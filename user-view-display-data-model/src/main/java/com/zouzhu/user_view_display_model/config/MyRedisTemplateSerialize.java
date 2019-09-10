package com.zouzhu.user_view_display_model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

@Configuration
public class MyRedisTemplateSerialize {

    /**
     *          描述 ：配置类, 自定义 RedisTemplate 序列化模板, 让保存的到 Redis 的键值, 以 json 格式保存
     *
     *          Auther : zouzhu
     *
     *          time : 2019/9/10  14:18
     * **/

    @Bean
    public RedisTemplate setRedisTemplateSerializer(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<Object, Object>();                  // 1. 创建 RedisTemplate <Object, Object>

        redisTemplate.setConnectionFactory(redisConnectionFactory);                                         // 2. 设置并获取 RedisConnection 连接

        redisTemplate.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());                       // 3. 设置序列化方案

        return redisTemplate;                                                                               // 4. 返回 RedisTemplate 模板
    }
}
