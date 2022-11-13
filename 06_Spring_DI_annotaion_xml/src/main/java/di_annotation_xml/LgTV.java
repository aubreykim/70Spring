package di_annotation_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class LgTV implements TV {
	@Autowired
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
