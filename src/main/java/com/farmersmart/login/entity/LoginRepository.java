package com.farmersmart.login.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginEntity, Integer> {

	public List<LoginEntity> getLoginByUsername(String username);

	//public String DeleteByUsername(String username);

}
