package co.hw.ex.serviceImpl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import co.hw.ex.service.Sound;
import co.hw.ex.service.TV;

@Component("lgtv")
public class LgTv implements TV {
	
	@Qualifier
	@Resource(name="AnySound")  //@Qualifier랑 한 세트, resource를 이걸로 지정한다 
	private Sound sound;
	
	public LgTv() {
		System.out.println("나는야 LG TV");
	}
	
	@Override
	public void on() {
		System.out.println("LG 켜짐");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public void speaker() {
		sound.soundDown();

	}

}
