package com.chihuobao.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.chihuobao.entity.User;

@Repository(value="userDao")
public class UserDaoImpl
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	public User getUser(User u)
	{
		Session session=sessionFactory.getCurrentSession();
		User user=(User)session.createQuery("select us from User us where name=:name and password=:password")
				.setParameter("name", u.getName())
				.setParameter("password", u.getPassword())
				.uniqueResult();
		return user;
	}	
}
