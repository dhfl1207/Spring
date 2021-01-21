package co.hw.spex.member.web;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.hw.spex.main.common.Paging;
import co.hw.spex.member.service.MemberService;
import co.hw.spex.member.service.impl.MemberMapper;
import co.hw.spex.member.vo.MemberVo;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	@Autowired
	MemberMapper dao;

	@RequestMapping("/ajax/memberList.do")
	@ResponseBody
	public List<MemberVo> ajaxMemberList(MemberVo vo) throws SQLException {
		return memberService.memberList(vo);
	}

	@RequestMapping("/memberList.do")
	public String memberList(Model model, @ModelAttribute("vo") MemberVo vo, Paging paging) throws SQLException {
		// 페이징 처리
		// 출력건수
		paging.setPageUnit(3);
		paging.setPageSize(3);
		// 페이지번호 파라미터
		if (paging.getPage() == null) { // 현재 페이지 번호, 안들어가면 1로 초기값
			paging.setPage(1);
		}
		// 시작/마지막 레코드 번호
		vo.setStart(paging.getFirst());
		vo.setEnd(paging.getLast());
		// 전체 건수
		paging.setTotalRecord(20);// 전체 레코드 건수
		// 맵개체는 필요없음
		model.addAttribute("paging", paging);
		List<MemberVo> member = memberService.memberList(vo);
		model.addAttribute("members", member);
		return "member/memberList";
	}

	@RequestMapping("/memberInsertForm.do")
	public String memberInsertForm() { // 입력폼을 호출한다.
		return "member/memberInsertForm";
	}

	@PostMapping("/memberInsert.do")
	public String memberInsert(MemberVo vo, Model model) throws SQLException {
		String viewPath = null;
		int n = memberService.memberInsert(vo);
		if (n != 0)
			viewPath = "redirect:memberList.do"; // 매핑매소드를 호출 할 때
		else
			viewPath = "member/memberInsertFail"; // jsp페이지를 호출 할 때

		return viewPath;
	}

	@RequestMapping("/memberUpdateForm.do")
	public String memberUpdateForm(MemberVo vo, Model model) { // 수정폼 호출
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

	@RequestMapping("/memberSelect.do")
	public String memberSelect(MemberVo vo, Model model) throws SQLException {
		MemberVo member = memberService.memberSelect(vo);
		return "member/memberSelect";
	}
}
