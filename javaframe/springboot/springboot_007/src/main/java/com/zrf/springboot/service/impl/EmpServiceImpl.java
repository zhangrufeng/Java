package com.zrf.springboot.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.zrf.springboot.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
	private JdbcTemplate jdbcTemplate;
	public void createJdbcEmp() {
		jdbcTemplate.update("INSERT INTO employee VALUES(NULL,?,?,?);","zhubajie","zhubajie@qq.com","2017-8-25");
	}

}
