package com.zrf.redis.test;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class TestApI {
  public static void main(String[] args) {
	Jedis jedis=new Jedis("192.168.1.105",6379);
	jedis.set("k1", "v1");
	jedis.set("k2", "v2");
	jedis.set("k3", "v3");
	System.out.println(jedis.get("k3"));
	Set<String> keys = jedis.keys("*");
	System.out.println(keys.size());
}
}
