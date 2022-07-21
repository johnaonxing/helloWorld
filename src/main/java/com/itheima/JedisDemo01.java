package com.itheima;


import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @Author XFX
 * @Date 2022/7/21 16:39
 */

public class JedisDemo01 {
    public static void main(String[] args) {
        //创建Jedis对象
        //Jedis jedis = new Jedis("xfx666", 6379);
        Jedis jedis = new Jedis("192.168.239.128", 6379);
        //测试
        String ping = jedis.ping();
        System.out.println(ping);

        Set keys = jedis.keys("*");
        for (Object key : keys) {
            System.out.println(key);
        }
    }
}
