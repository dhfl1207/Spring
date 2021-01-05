package co.hw.ex.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.hw.ex.service.Sound;
import co.hw.ex.service.TV;

@Component("samsungtv")
public class SamsungTv implements TV {
	
//	private Sound sound = new Sound(); //아래 두 줄과 같은 작용 
	@Autowired //= 강제로 값을 입력해라 . 이 타입의 것을 자동으로 찾아라 
	private Sound sound; 
	
	public SamsungTv() {
		System.out.println("나는 삼성 TV");
	}

	@Override
	public void on() {
		System.out.println("Samsung 켜짐");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public void speaker() {
		sound.soundUp();

	}

}
