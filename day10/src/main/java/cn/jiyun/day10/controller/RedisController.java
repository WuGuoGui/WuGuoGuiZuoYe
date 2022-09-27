package cn.jiyun.day10.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: RedisController
 * Author:   WGG
 * Date:    2022-09-2022/9/27-13:10
 * Version: 1.0
 * Description:
 */
@RestController
@RequestMapping("redis")
public class RedisController {
    @Resource
    RedisTemplate redisTemplate;

    @RequestMapping("redis")
    public Object redis(){
        redisTemplate.opsForValue().set("name", "zhangsan");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);
        return name;
    }
}
