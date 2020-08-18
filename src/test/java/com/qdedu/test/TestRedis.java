package com.qdedu.test;

import com.qdedu.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Resource
    private RedisUtil util;

    @Test
    public void testStringSet(){
        System.out.println(util+"==========");
        System.out.println(util.set("hello0812","world0812"));
        System.out.println(util.getExpired("hello0812"));
    }
}
