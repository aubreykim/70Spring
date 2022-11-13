package com.spring.biz.user;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.biz.user.impl.UserServiceImpl;

public class UserServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext container 
			= new GenericXmlApplicationContext("applicationContext_after_returning.xml");
		
		//UserServiceImpl user = (UserServiceImpl) container.getBean("userService");
		UserService user = (UserServiceImpl) container.getBean("userService");
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test");

		UserVO userVO = user.getUser(vo);
		System.out.println(userVO);
	}

}
