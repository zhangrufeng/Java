package com.zrf.redis.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class Test01 {
	public static void main(String[] args) {
	  Jedis jedis=new Jedis("192.168.1.105",6379);
	  //key
	 // Set<String>keys=jedis.keys("*");
	  /*Iterator<String> iterator = keys.iterator();
	  while(iterator.hasNext()){
		  String str=iterator.next();
		  System.out.println(str);
	  }*/
	  //System.out.println("jedis.exists====="+jedis.exists("k2"));
	  //存活期
	 // System.out.println(jedis.ttl("k1"));
	  //String
	  //jedis.append("k1", "myreids");
	  //System.out.println(jedis.get("k1"));
	  //jedis.set("k4", "v4");
	  /*System.out.println("----------------------------------------");
	  jedis.mset("str1","v1","str2","v2","str3","v3");
	  System.out.println(jedis.mget("str1","str2","str3"));*/
	//list
	  /*System.out.println("----------------------------------------");
	  jedis.lpush("mylist", "v1","v2","v3","v4","v5");
	  List<String> lrange = jedis.lrange("mylist", 0, -1);
	  for(String elem:lrange){
		  System.out.println(elem);
	  }*/
	  //set
	 /* jedis.sadd("orders", "jd001");
	  jedis.sadd("orders", "jd002");
	  jedis.sadd("orders", "jd003");
	  Set<String> smembers = jedis.smembers("orders");
	  for(Iterator<String>iterator=smembers.iterator();iterator.hasNext();){
		  String string=iterator.next();
		  System.out.println(string);
	  }
	  jedis.srem("orders", "jd002");
	  System.out.println(jedis.smembers("orders").size());*/
	  //hash
	 /* jedis.hset("hash1", "username", "lisi");
	  System.out.println(jedis.hget("hash1", "username"));
	  Map<String,String>map=new HashMap<String,String>();
	  map.put("telphone", "13811814763");
	  map.put("address", "xian");
	  map.put("email", "abc@163.com");
	  jedis.hmset("hash2", map);
	  List<String> mget = jedis.hmget("hash2","telphone","email");
	  for(String element:mget){
		  System.out.println(element);
	  }*/
      //zset
	 /* jedis.zadd("zset01",60d,"v1");
	  jedis.zadd("zset01", 70d,"v2");
	  jedis.zadd("zset01", 80d,"v3");
	  jedis.zadd("zset01", 90d,"v4");
	  Set<String> zrange = jedis.zrange("zset01", 0, -1);
	  for(Iterator<String>iterator=zrange.iterator();iterator.hasNext();){
		  String string=iterator.next();
		  System.out.println(string);
	  }*/
	}
}
