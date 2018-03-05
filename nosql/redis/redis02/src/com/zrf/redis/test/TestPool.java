package com.zrf.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestPool {
	public static void main(String[] args) {
		JedisPool jedisPool = JedisPoolUtil.getJedisPoolInstance();
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			jedis.set("aa", "bb");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			JedisPoolUtil.release(jedisPool, jedis);
		}
	}
}
