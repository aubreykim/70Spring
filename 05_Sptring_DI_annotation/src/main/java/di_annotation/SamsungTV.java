package di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component : 객체 생성
//@Component : 명칭 생략시 samsungTV 명칭 사용 (클래스명 첫글자 소문자)
@Component("tv")
class SamsungTV implements TV{
	@Autowired // 동일한 데이터 타입을 찾아서 주입
	// ex. Speaker 인터페이스 타입을 의미하는 게 아닌 Speaker 인터페이스에 주입 가능한 데이터 타입
	// SonySpeaker 타입과 AppleSpeaker 타입이 해당됨
	@Qualifier("sony") //appleSpeaker과 sony 중 sony를 사용하도록 명시
	private Speaker speaker;
	private int price;
	private int width; 
	private int height; 
	
	
	public SamsungTV() {
		System.out.println(">> SamsungTV 객체 생성");
	}
	/*
	public SamsungTV(Speaker speaker) {
		System.out.println(">> SamsungTV(speaker) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println(">> SamsungTV(speaker, price) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public SamsungTV(Speaker speaker, int width, int height) {
		System.out.println(">> SamsungTV(speaker, width, height) 객체 생성");
		this.speaker = speaker;
		this.width = width;
		this.height = height;
	}
	*/
	
	public void powerOn() {
		System.out.println("SamsungTV - 전원ON");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV - 전원OFF");
	}
	
	public void volumnUp() {
		System.out.println("SamsungTV - 소리 크게");
		speaker.volumnUp();
	}
	
	public void volumnDown() {
		System.out.println("SamsungTV - 소리 작게");
		speaker.volumnDown();
	}

	//-----------------
	public void initMethod() {
		System.out.println(">> SamsungTV의 initMethod() 실행");
	}
	
	public void destroyMethod() {
		System.out.println(">> SamsungTV의 destroyMethod() 실행");
	}

	@Override
	public String toString() {
		return "SamsungTV [speaker=" + speaker + ", price=" + price + ", width=" + width + ", height=" + height + "]";
	}
	
	
	//== getter, setter 추가

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	
}
