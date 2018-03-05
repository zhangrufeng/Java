package com.zrf.redis.test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class TestTrsaction {
	public static void main(String[] args) throws InterruptedException {
		TestTrsaction test=new TestTrsaction();
		boolean transMethod = test.transMethod();
		 System.out.println("main transMethod-------: " + transMethod);
		/*
		 * Transaction multi = jedis.multi(); multi.set("k44", "v44");
		 * multi.set("k55", "v55"); multi.exec();
		 */
		// multi.discard();
	}

	public boolean transMethod() throws InterruptedException {
		Jedis jedis = new Jedis("192.168.1.105", 6379);
		int balance;// 可用余额
		int debt;// 欠额
		int amtToSubtract = 10;// 实刷额度

		jedis.watch("balance");
		// jedis.set("balance","5");//此句不该出现，讲课方便。模拟其他程序已经修改了该条目
		Thread.sleep(7000);
		balance = Integer.parseInt(jedis.get("balance"));
		if (balance < amtToSubtract) {
			jedis.unwatch();
			System.out.println("modify");
			return false;
		} else {
			System.out.println("***********transaction");
			Transaction transaction = jedis.multi();
			transaction.decrBy("balance", amtToSubtract);
			transaction.incrBy("debt", amtToSubtract);
			transaction.exec();
			balance = Integer.parseInt(jedis.get("balance"));
			debt = Integer.parseInt(jedis.get("debt"));

			System.out.println("*******" + balance);
			System.out.println("*******" + debt);
			return true;
		}
	}
}
