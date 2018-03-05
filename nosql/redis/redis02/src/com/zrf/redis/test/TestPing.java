package com.zrf.redis.test;

import redis.clients.jedis.Jedis;

public class TestPing {
  public static void main(String[] args) {
	Jedis jedis=new Jedis("192.168.1.105", 6379);
	System.out.println(jedis.ping());
}
}
