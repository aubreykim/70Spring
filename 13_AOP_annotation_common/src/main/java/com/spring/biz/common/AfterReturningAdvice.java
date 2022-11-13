package com.spring.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.spring.biz.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {
	
	// returnObj : 추가 바인드변수를 사용시에는 스프링 설정 파일에 작성 추가
	//어드바이스에 포인트 컷 연결
	@AfterReturning(pointcut = "PointcutCommon.allPointcut()", returning = "returnObj")
	public void afterReturnLog(JoinPoint jp, Object returnObj) {
		//정상실행시 전달받을 returnObj는 Spring framework에 지정해 줘야 함
		String methodName = jp.getSignature().getName();
		
		//리턴받은 객체를 확인하고 필요한 작업 처리
		if (returnObj instanceof UserVO) {
			UserVO vo = (UserVO) returnObj;
			if ("admin".equalsIgnoreCase(vo.getRole())) {
				System.out.println(vo.getName() + "-로그인(Admin)");
			} else {
				System.out.println(vo.getName() + "-로그인");				
			}
		}
		
		System.out.println("[후처리-정상처리]" + methodName + "()메소드, "
				+ "리턴값: " + returnObj);
		
	
	}
	
}
