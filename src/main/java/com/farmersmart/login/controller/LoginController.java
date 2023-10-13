package com.farmersmart.login.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmersmart.login.entity.LoginEntity;
import com.farmersmart.login.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService service;
	
	@PostMapping("/addLogin")
	public String addLogin(@RequestBody LoginEntity entity) {
		service.addLogin(entity);
		String response = "Added successfully"; 
		logger.info(response);
		return response;
	}
	@PutMapping("/updateLogin")
	public String updateLogin(@RequestBody LoginEntity entity) {
		service.updateLogin(entity);
		String response = "Updated successfully"; 
		logger.info(response);
		return response;
	}
	@GetMapping("/getLogin")
	public List<LoginEntity> getLogin() {
		return service.getLogin();
    }
	@GetMapping("/getLoginById")
	public Optional<LoginEntity> getLoginById(@RequestParam int id) {
		return service.getLoginById(id);
	}
	@GetMapping("/getLoginByUsername")
	public List<LoginEntity> getLoginByUsername(@RequestParam String username) {
		return service.getLoginByUsername(username);
	}
	@DeleteMapping("/deleteLoginById")
	public String deleteLoginById(@RequestParam int id) {
		service.deleteLoginById(id);
		String response = "Deleted successfully";
		logger.info(response);
		return response;
	}
	/*
	@DeleteMapping("/DeleteByUsername")
	public String DeleteByUsername(@RequestParam String username) {
		service.DeleteByUsername(username);
		return "Deleted successfully";
	}
	*/
}
