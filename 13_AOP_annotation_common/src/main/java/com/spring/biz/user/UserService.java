package com.spring.biz.user;

public interface UserService {
	
	UserVO getUser(UserVO vo);
	//public abstract UserVO getUser(UserVO vo);
	//public abstract 없어도 자동으로 public abstrac으로 생성됨
}
