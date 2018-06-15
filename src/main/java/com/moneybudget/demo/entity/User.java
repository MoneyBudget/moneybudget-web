package com.moneybudget.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
        private int userId;  
	@Column(name="username")
        private String username;
	@Column(name="password")	
	private String password;
	@Column(name="email")	
	private String email;
	@Column(name="usergroup")	
	private String usergroup;
	
	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsergroup() {
		return usergroup;
	}
	public void setUsergroup(String usergroup) {
		this.usergroup = usergroup;
	}
/*	public static long getSerialversionuid() {
		return serialVersionUID;
	}*/
}  