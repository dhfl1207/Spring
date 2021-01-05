package co.hw.ex.serviceImpl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import co.hw.ex.service.TV;

public class MainApp {

	public static void main(String[] args) {
		String context = "classpath:beanConfig.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(context); //컨테이너 구축
		//beanConfig의 conponent-scan으로 밑에 코드가 없어도 기본 정보는 가지고온다.
		
		TV tv = ctx.getBean("samsungtv", TV.class);
		tv.on();  //생성 된 것을 가지고 온다
		tv.speaker();
		
		tv = ctx.getBean("lgtv", TV.class);
		tv.on();
		tv.speaker();
		
		ctx.close();
	}

}
