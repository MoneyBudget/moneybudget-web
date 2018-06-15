package com.moneybudget.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.moneybudget.demo.entity.User;
@Transactional
@Repository
public class UserDAOImpl implements UserDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers(){
		String hql = "FROM User as usr ORDER BY usr.userId";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}
}
