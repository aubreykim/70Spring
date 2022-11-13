package com.spring.biz.common;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service //객체(인스턴스) 생성
@Aspect //포인트컷 + 어드바이스 연결
public class BeforeAdvice {
	
	//어드바이스 동작 시점 + 포인트컷 지정
	@Before("PointcutCommon.allPointcut()") //메소드 호출 형식으로 지정
	public void beforeLog(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		//.getName() 메소드 명
		Object[] args = jp.getArgs();
		System.out.println("args: " + Arrays.toString(args));
		System.out.println("[사전처리] " + methodName + "() 메소드 -"
				+ "비즈니스 로직 수행전 로그");
	}
}
