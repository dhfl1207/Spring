package co.hw.hello.serviceimpl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import co.hw.hello.service.TV;
import co.hw.hello.vo.FamilyVo;

public class DiHello {

	public static void main(String[] args) {
		//IOC를 이용해서 작업해보기
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("BeanConfigue.xml", "BeanConfigue2.xml"); //xml이 여러개이면 이렇게 적을 수 있다.
		TV tv = ctx.getBean("tv", TV.class);
		FamilyVo vo = ctx.getBean("family", FamilyVo.class);
		
		tv.tvOn();
		tv.tvOff();
		tv.soundUp();
		tv.soundDown();
		
		vo.toString();
		
		ctx.close(); //IOC 컨테이너 메모리를 반환하라

	}

}
