package co.hw.ex.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("AnySound")
// = @Service 이게 없으면 main을 실행시킬 때 오류가 생긴다. 
//@Repository vo 객체에 사용한다. 
public class Sound {
	public void soundUp() {
		System.out.println("소리를 증가 시킨다.");
	}
	
	public void soundDown() {
		System.out.println("소리를 감소 시킨다.");
		
	}

}
