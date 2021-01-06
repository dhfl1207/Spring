package co.hw.spex1.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/member") //메소드가 하나만 있으면 여기다 적을 수 있다/ 근데 밑에 메소드에도 @RequestMapping를 적어야함. 잘 안씀
public class MemberController {
	
	@RequestMapping("/member/list")
	public String list(Model model) { //요청하는 메소드 이름과 돌려주는 페이지 이름이 같으면 좋다 
		//필요한 것을 기술한다
		
		return "member/list"; //돌려주는 페이지
	}

}
