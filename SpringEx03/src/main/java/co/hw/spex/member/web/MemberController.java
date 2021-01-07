package co.hw.spex.member.web;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.hw.spex.member.service.MemberService;
import co.hw.spex.member.vo.MemberVo;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/memberList.do")
	public String memberList(Model model) throws SQLException {
		ArrayList<MemberVo> members = new ArrayList<MemberVo>();
		members = memberService.memberList();
		model.addAttribute("members", members);
		return "member/memberList";
	}
	
	@RequestMapping("/memberInsertForm.do")
	public String memberInsertForm() {            //입력폼을 호출한다.
		return "member/memberInsertForm";
	}
	
	@PostMapping("/memberInsert.do")
	public String memberInsert(MemberVo vo, Model model) throws SQLException {
		String viewPath = null;
		int n = memberService.memberInsert(vo);
		if (n != 0) 
			viewPath = "redirect:memberList.do"; //매핑매소드를 호출 할 때
		else 
			viewPath = "member/memberInsertFail"; //jsp페이지를 호출 할 때
		
		return viewPath;
	}
	
	@RequestMapping("/memberUpdateForm.do")
	public String memberUpdateForm(MemberVo vo, Model model) {           //수정폼 호출
		MemberVo member = null;
		try {
			member = memberService.memberSelect(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("member", member);
		return "member/memberUpdateForm";
	}
	
	@PostMapping("/memberUpdate.do")
	public String memberUpdate(MemberVo vo, Model model) throws SQLException {
		String viewPath = null;
		int n = memberService.memberUpdate(vo);
		if (n != 0)
			viewPath = "redirect:memberList.do";
		else
			viewPath = "member/memberUpdateFail";
		
		return viewPath;
	}
	
	@RequestMapping("/memberDelete.do")
	public String memberDelete(MemberVo vo, Model model) throws SQLException {
		String viewPath = null;
		int n = memberService.memberDelete(vo);
		if (n != 0)
			viewPath = "redirect:memberList.do";
		else
			viewPath = "member/memberUpdateFail";
		
		return viewPath;
	}
	
	@RequestMapping("/memberLoginCheckForm.do")
	public String memberLoginCheckForm() {
		return "member/memberLoginCheckForm";
	}
	
	@PostMapping("/memberLoginCheck.do")
	public String memberLoginCheck(MemberVo vo, Model model) throws SQLException {
		String viewPath = null;
		boolean check = memberService.memberLoginCheck(vo);
		if (check = true) 
			viewPath = "redirect:memberList.do"; 
		else 
			viewPath = "member/memberLoginCheckFail"; 
		
		return viewPath;
	}
}
