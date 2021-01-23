package co.hw.spex.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.hw.spex.emp.service.impl.EmpMapper;
import co.hw.spex.emp.vo.DeptVo;
import co.hw.spex.emp.vo.EmpVo;
import co.hw.spex.emp.vo.JobVo;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;
	
	@ModelAttribute("deptList")
	public List<DeptVo> deptList() {
		return empMapper.getDept();
	}

	// 등록페이지
	@RequestMapping("insEmpForm")
	public String insEmpForm(EmpVo vo) {
		return "emp/empForm";
	}

	// 수정페이지로 이동
	@RequestMapping("updEmpForm")
	public String updEmpForm(EmpVo vo, Model model) {
		model.addAttribute("empVo", empMapper.getEmp(vo));
		return "emp/empForm";
	}

	// 등록/수정 처리
	@RequestMapping("insUpEmp")
	public String insUpdEmp(EmpVo vo) {
		return "emp/empForm";
	}
	
	@ModelAttribute("jobList")
	public List<JobVo> jobList() {
		return empMapper.getJob();
	}
}
