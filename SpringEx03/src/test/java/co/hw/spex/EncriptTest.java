package co.hw.spex;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptTest {
	public static void main(String[] args) {
		BCryptPasswordEncoder scpwd = new BCryptPasswordEncoder();
		// 암호화 하기전
		String password1 = scpwd.encode("1234");
		String password2 = scpwd.encode("1234");
		System.out.println(password1);
		System.out.println(password2);
		System.out.println(password1.equals(password2));
		System.out.println(scpwd.matches("1234", password1));
	}
}
