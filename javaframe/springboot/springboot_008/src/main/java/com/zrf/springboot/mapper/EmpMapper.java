package com.zrf.springboot.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zrf.springboot.entity.EmpEntity;

public interface EmpMapper {
   @Select("SELECT * FROM employee WHERE NAME=#{name}")	
   EmpEntity findName(@Param("name") String name);
}
