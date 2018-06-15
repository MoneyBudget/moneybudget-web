package com.moneybudget.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.moneybudget.demo.dao.UserDAO;
import com.moneybudget.demo.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO UserDAO;
	
	public List<User> getAllUsers(){
		return UserDAO.getAllUsers();
	}
}
