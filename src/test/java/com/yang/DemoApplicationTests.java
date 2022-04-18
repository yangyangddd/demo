package com.yang;

import com.yang.domain.book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    void set() {
        ValueOperations ops= redisTemplate.opsForValue();
        ops.set("age",41);

    }
    @Test
    void get()
    {
        ValueOperations ops = redisTemplate.opsForValue();
        int age = (int) ops.get("age");
        System.out.println(age);
    }
    @Test
    void mongodb()
    {
        mongoTemplate.save(new book(2,"111saq"));
        List<book> all = mongoTemplate.findAll(book.class);
        System.out.println(all);

    }

}
