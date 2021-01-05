package co.hw.student;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@ImportResource("classpath:beanConfig.xml")
public class BeanConfig {
	
	@Bean
	public Student student1() { //<bean id="student1" class="co.hw.student.Student" />
		ArrayList<String> hobbys = new ArrayList<String>();
			hobbys.add("등산");
			hobbys.add("낚기");
			hobbys.add("달리기");
			
		String name = "홍길동";
		Student student = new Student("홍길동", "18", hobbys); //생성자가 요구하는게 3가지니까
		student.setHeight("180");
	
		return student;
	}
	
}
