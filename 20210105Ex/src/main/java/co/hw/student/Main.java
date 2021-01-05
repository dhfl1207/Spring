package co.hw.student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:beanXmlConfig.xml"); //java를 불어러오는 것 
		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class); //xml을 불러오는 방법
		
		Student st = ctx.getBean("student1", Student.class);
		st.toString(); //찍어오는 용도
		
		System.out.println("=============");
		st = ctx.getBean("student2", Student.class);
		st.toString();
		
		ctx.close();

	}

}
