package polymorphism01;

class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println(">> SamsungTV 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV - 전원ON");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV - 전원OFF");
	}
	
	public void volumnUp() {
		System.out.println("SamsungTV - 소리 크게");
	}
	
	public void volumnDown() {
		System.out.println("SamsungTV - 소리 작게");
	}


}
