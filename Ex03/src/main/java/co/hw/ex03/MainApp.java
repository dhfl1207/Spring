package co.hw.ex03;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import co.hw.ex03.member.service.MemberService;
import co.hw.ex03.member.vo.MemberVo;

public class MainApp {

	public static void main(String[] args) {
		String context = "classpath:BeanConfig.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(context);
		
		MemberService member = (MemberService) ctx.getBean("memberService");
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		list = member.selectAll();
		
		for(MemberVo vo : list) {
			vo.toString();
		}
	
		ctx.close();
	
	}

}
