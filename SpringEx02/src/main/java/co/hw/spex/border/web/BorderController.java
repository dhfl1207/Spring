package co.hw.spex.border.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.hw.spex.border.service.BorderService;
import co.hw.spex.border.vo.BorderVo;

@Controller
public class BorderController {
	@Autowired
	private BorderService borderService;

	@RequestMapping("/border/list")
	public String list(Model model) {
		ArrayList<BorderVo> list = new ArrayList<BorderVo>();
		list = borderService.selectList();

		model.addAttribute("borderList", list);
//                 //jsp에서 사용할 이음     위에 list 담아서 보낸다.     
		return "border/list";
	}
	
	@RequestMapping("/border/input") //입력폼을 호출한다.
	public String input() {
		return "border/input";
	}
	
	@RequestMapping("/border/borderinput") //실제 DB에 저장하는 메소드
	public String borderinput(BorderVo vo, Model model) {
		int n = 0;
		String viewPath = null;
		n = borderService.insert(vo);
		if(n != 0) {
			viewPath = "redirect:list";
		}else {
			viewPath="border/inputfail";
		}
		
		return viewPath; //DB에 입력하고 목록으로 돌려준다
	}
}
