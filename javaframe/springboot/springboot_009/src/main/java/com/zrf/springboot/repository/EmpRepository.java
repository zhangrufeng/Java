package com.zrf.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zrf.springboot.entity.EmpEntity;

public interface EmpRepository extends JpaRepository<EmpEntity, Integer>{

}
