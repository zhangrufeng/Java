package com.zrf.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zrf.mybatis.bean.Employee;

public class MyBatisTest {
    
	@Test
	public void test() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession=sqlSessionFactory.openSession();
		try{
			Employee employee=sqlSession.selectOne("com.zrf.mybatis.EmployeeMapper.selectEmp",1);
			System.out.println(employee);
		}finally{
			sqlSession.close();
		}
		
	}

}
