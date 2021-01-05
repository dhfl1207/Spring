package co.hw.hello.service;

public class Hello {

	public static void main(String[] args) {
//		TV tv = new SamsungTv();
		TV tv = new LgTv();
		tv.tvOn();
		tv.tvOff();
		tv.soundUp();
		tv.soundDown();

	}

}
