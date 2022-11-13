package polymorphism01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		System.out.println("--- 스프링 컨테이너 구동 전 ---");
		//1. 스프링 컨테이너 구동(스프링 설정파일 읽어서)
		GenericXmlApplicationContext factory 
			= new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("--- 스프링 컨테이너 구동 후 ---");
		
		//2. 스프링 컨테이너 사용: 생성된 객체 요청 (lookup)
		System.out.println("--- tv 요청 사용 ---");
		TV tv = (TV) factory.getBean("tv");
		System.out.println("tv: " + tv);
		
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
		
		System.out.println("--- tv 요청 한 번 더 ---");
		tv = (TV) factory.getBean("tv");
		System.out.println("tv: " + tv);
		//동일 객체가 출력되고 한 번만 생성된 객체를 다시 불러다 주는 것
		
		//3. 스프링 컨테이너 종료 (close)
		factory.close();
		
	}

}
