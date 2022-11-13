package polymorphism03;

class SamsungTV implements TV{

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
