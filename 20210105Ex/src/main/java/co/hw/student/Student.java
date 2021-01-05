package co.hw.student;

import java.util.ArrayList;

public class Student {
	private String name;
	private String age;
	private ArrayList<String> hobbys;
	private String height;
	
	public Student(String name, String age, ArrayList<String> hobbys) {
		//생성자
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
		//생성하면서 이것들은 꼭 받아오겠다는 것
	}

	public void setHeight(String height) {
		this.height = height;
	}
	
	public String toString() {
		System.out.println("학생명 : " + name);
		System.out.println("나 이 : " + age);
		System.out.println(" 키 : " + height);
		System.out.println("취 미 :");
		
		for(String hobby : hobbys) {
			System.out.println(hobby);
		}
		return null;
	}
	

}
