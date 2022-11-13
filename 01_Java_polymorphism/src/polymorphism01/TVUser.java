package polymorphism01;

public class TVUser {

	public static void main(String[] args) {
		//삼성TV 사용
//		SamsungTV tv = new SamsungTV();	
//		tv.powerOn();
//		tv.volumnUp();
//		tv.volumnDown();
//		tv.powerOff();
		
		//LgTV 사용 형태로 변경
		LgTV tv = new LgTV();
		tv.on();
		tv.soundUp();
		tv.soundDown();
		tv.off();

	}

}
