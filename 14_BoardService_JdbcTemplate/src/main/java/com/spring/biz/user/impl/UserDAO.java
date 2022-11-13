package com.spring.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.spring.biz.common.JDBCUtil;
import com.spring.biz.user.UserVO;

@Repository
public class UserDAO {
	
	Connection conn;
	PreparedStatement stmt;
	ResultSet rs;
	
	
	//SQL문
	private final String USER_GET 
		= "SELECT * FROM USERS WHERE ID = ? AND PASSWORD = ? ";
	
	public UserDAO() {
		System.out.println(">> UserDAO() 객체 생성");
	}
	
	// id, password가 일치하는 데이터 조회
	public UserVO getUser(UserVO vo) {
		UserVO user = null;
		System.out.println("JDBC로 getUser() 실행");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(USER_GET);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	
}
