package com.kebo;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @description:
 * @author: kb
 * @create: 2020-06-01 21:34
 **/
public class TestString {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.31.26",6379);
        System.out.println("清空数据："+jedis.flushDB());
        System.out.println("判断某个键是否存在："+jedis.exists("username"));
        System.out.println("设置key值："+jedis.set("username","kebo"));
        System.out.println("设置key值："+jedis.set("pass","123456"));
        Set<String> keys=jedis.keys("*");
        System.out.println(keys);
        System.out.println("删除一个key值："+jedis.del("pass"));
        System.out.println("判断某个键是否存在："+jedis.exists("pass"));
        System.out.println("拿取key对应的value:"+jedis.get("username"));
    }
}

