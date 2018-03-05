package com.zrf.springboot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zrf.springboot.entity.EmpEntity;

public interface EmpMapper {
   @Select("SELECT * FROM employee WHERE NAME=#{name}")	
   EmpEntity findName(@Param("name") String name);
   @Insert("insert into employee values(null,#{name},#{email},#{hiredate});")
   int insertEmp(@Param("name")String name,@Param("email")String email,@Param("hiredate")String hiredate);
}
