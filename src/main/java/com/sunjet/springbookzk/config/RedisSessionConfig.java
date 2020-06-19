package com.sunjet.springbookzk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400)
public class RedisSessionConfig {

//    @Bean
//    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory){
//        return new StringRedisTemplate(redisConnectionFactory);
//    }
//
//    @Bean
//    public static ConfigureRedisAction configureRedisAction(){
//        return ConfigureRedisAction.NO_OP;
//    }
}
