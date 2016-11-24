package com.chihuobao.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chihuobao.entity.User;
import com.chihuobao.service.impl.UserServiceImpl;

@Controller
@RequestMapping("user")
public class UserController
{
	@Resource(name="userService")
	private UserServiceImpl userService;
	@RequestMapping("/login.do")
	public String login()
	{
		return "/user/login";
	}
	@RequestMapping("/doLogin.do")
	public String doLong(User user)
	{
		if(userService.login(user)!=null)
			return "/user/hello";
		else
			return "errer";
	}

	public void setUserService(UserServiceImpl userService)
	{
		this.userService = userService;
	}
	
}
