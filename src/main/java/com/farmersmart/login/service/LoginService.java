package com.farmersmart.login.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmersmart.login.entity.LoginEntity;
import com.farmersmart.login.entity.LoginRepository;

@Service
public class LoginService {

	private static final Logger logger = LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	LoginRepository repository;
	String response;
	public String addLogin(LoginEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		logger.info(response);
		response = "Added successfully";
		return response;
	}

	public String updateLogin(LoginEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		logger.info(response);
		response = "Updated successfully";
		return response;
	}

	public List<LoginEntity> getLogin() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}

	public Optional<LoginEntity> getLoginById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public List<LoginEntity> getLoginByUsername(String username) {
		// TODO Auto-generated method stub
		return repository.getLoginByUsername(username);
	}

	public String deleteLoginById(int id) {
		// TODO Auto-generated method stub
		String message;
		try {
		repository.deleteById(id);
		message = "Customer deleted successfully";
		logger.info(message);
		}catch (Exception e) {
			
			// TODO: handle exception
			message = "Invalid Id: "+id;
			logger.error(message);
		}
		return message;
	}

	/*
	public String DeleteByUsername(String username) {
		// TODO Auto-generated method stub
		repository.DeleteByUsername(username);
		return "Deleted successfully";
	}
	*/
	

}
