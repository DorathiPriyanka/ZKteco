package com.zkteco.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zkteco.access.entity.Access;
@Repository
public interface AccessRepository  extends JpaRepository<Access, Integer>{
	
	
}
