package com.sample.redisson.repository.impl;

import com.sample.redisson.repository.RedisRepository;
import org.redisson.api.LocalCachedMapOptions;
import org.redisson.api.RLocalCachedMap;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class RedissonRepositoryImpl implements RedisRepository {

    @Autowired
    private RedissonClient client;

    @Override
    public Map<String, Object> hgetall(String key) {
        RLocalCachedMap<String,String> map = client.getLocalCachedMap(key, LocalCachedMapOptions.defaults());

        return null;
    }

    @Override
    public void hset(String key, Map<String, Object> data) {

    }
}
