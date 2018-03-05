package com.zrf.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zrf.springboot.mapper.EmpMapper;

@Service
public class EmpService {
	@Autowired
	private EmpMapper empMapper;
    
	//事务注解
	@Transactional
	public int addEmp(String name, String email, String hiredate) {
		int insertEmp=empMapper.insertEmp(name, email, hiredate);
		int i=1/0;
		return insertEmp;
	}
}
