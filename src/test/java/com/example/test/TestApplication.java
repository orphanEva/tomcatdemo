package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.*;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class TestApplication {
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        HashMap<String,Integer> map = new HashMap<>();
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(Files.newInputStream(new File("D:\\新建文本文档.txt").toPath())))) {
            String line;
            while ((line = buf.readLine()) != null) {
//                redisTemplate.opsForZSet().incrementScore("test:zset", line, 1);
                // 这是主分支
//                redisTemplate.opsForZSet().incrementScore("test:zset", line, 1);？？？？
                if(map.get(line) == null){
                    map.put(line, 1);
                }else {
                    map.put(line, map.get(line) + 1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1).forEach(System.out::println);
//        Set<ZSetOperations.TypedTuple<String>> result = redisTemplate.opsForZSet().reverseRangeWithScores("test:zset", 0, 0);
//        for (ZSetOperations.TypedTuple<String> tuple : result){
//            System.out.println(tuple.getValue() + ": " + tuple.getScore());
//        }

        new Thread(()->{
            System.out.println("执行任务");
        }).start();

//        new String()

    }
}
