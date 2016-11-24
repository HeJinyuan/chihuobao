package com.chihuobao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chihuobao.dao.impl.UserDaoImpl;
import com.chihuobao.entity.User;

@Service(value="userService")
public class UserServiceImpl
{
	@Resource(name="userDao")
	private UserDaoImpl userDao;
	
	
	public User login(User user)
	{
		return userDao.getUser(user);
	}
	public void setUserDao(UserDaoImpl userDao)
	{
		this.userDao = userDao;
	}
}
