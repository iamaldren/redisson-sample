package com.sample.redisson.repository;

import java.util.Map;

public interface RedisRepository {

    Map<String,Object> hgetall(String key);

    void hset(String key, Map<String,Object> data);

}
