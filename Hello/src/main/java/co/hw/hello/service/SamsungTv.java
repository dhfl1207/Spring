package co.hw.hello.service;

public class SamsungTv implements TV {

	@Override
	public void tvOn() {
		System.out.println("SAMSUNG TV 켜짐");
		
	}

	@Override
	public void tvOff() {
		System.out.println("SAMSUNG TV 꺼짐");

	}

	@Override
	public void soundUp() {
		System.out.println("SAMSUNG TV 볼륨 업");

	}

	@Override
	public void soundDown() {
		System.out.println("SAMSUNG TV 볼륨 다운");

	}

}
