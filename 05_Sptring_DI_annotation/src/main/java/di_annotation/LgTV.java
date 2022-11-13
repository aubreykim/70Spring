package di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //lgTV 명칭으로 객체 생성 (클래스명 첫글자 소문자)
class LgTV implements TV {
@Autowired // 동일한 데이터 타입을 찾아서 주입
@Qualifier("sony")
private Speaker speaker;

	public LgTV() {
		System.out.println(">> LgTV 객체 생성 2");
	}
	
	
	public void powerOn() {
		System.out.println("LgTV - 전원 ON");
	}
	public void powerOff() {
		System.out.println("LgTV - 전원 OFF");
	}
	public void volumnUp() {
		System.out.println("LgTV - 소리 크게");
		speaker.volumnUp();
	}
	public void volumnDown() {
		System.out.println("LgTV - 소리 작게");
		speaker.volumnDown();
	}
	
	//-----------------
	public void initMethod() {
		System.out.println(">> LgTV의 initMethod() 실행");
	}
	
	public void destroyMethod() {
		System.out.println(">> LgTV의 destroyMethod() 실행");
	}

	@Override
	public String toString() {
		return "LgTV [speaker=" + speaker + "]";
	}
	
	
}
