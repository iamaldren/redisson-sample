package com.sample.redisson.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Value("${redisson.instances}")
    private String instance;

    @Bean
    public RedissonClient redissonClient() {
        Config config =  new Config();
        config.useSingleServer().setAddress(instance);

        return Redisson.create(config);
    }

}
