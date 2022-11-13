package polymorphism01;

class LgTV implements TV {
	
	public LgTV() {
		System.out.println(">> LgTV 객체 생성");
	}
	
	
	public void powerOn() {
		System.out.println("LgTV - 전원 ON");
	}
	public void powerOff() {
		System.out.println("LgTV - 전원 OFF");
	}
	public void volumnUp() {
		System.out.println("LgTV - 소리 크게");
	}
	public void volumnDown() {
		System.out.println("LgTV - 소리 작게");
	}
}
