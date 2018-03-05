package redis_01;

import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * Redis Java List(列表) 实例
 * @author Administrator
 *
 */
public class RedisListJava {
  public static void main(String[] args) {
	Jedis jedis=new Jedis("localhost");
	System.out.println("连接成功");
	 //存储数据到列表中
	jedis.lpush("site-list", "Runoob");
	jedis.lpush("site-list", "Google");
	jedis.lpush("site-list", "Taobao");
	 // 获取存储的数据并输出
	List<String> lrange = jedis.lrange("site-list", 0, 2);
	for(int i=0;i<lrange.size();i++){
		System.out.println("列表项为:"+lrange.get(i));
	}
}
}
