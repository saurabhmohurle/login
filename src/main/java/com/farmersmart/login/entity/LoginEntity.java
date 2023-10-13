package com.farmersmart.login.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class LoginEntity {
	@Id
	private int id;
	private String username;
	private String password;
	/**
	 * 
	 */
	public LoginEntity() {
		super();
	}
	/**
	 * @param id
	 * @param username
	 * @param password
	 */
	public LoginEntity(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginEntity [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
}
