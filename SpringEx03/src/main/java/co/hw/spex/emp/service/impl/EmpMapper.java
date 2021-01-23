package co.hw.spex.emp.service.impl;

import java.util.List;

import co.hw.spex.emp.vo.EmpVo;
import co.hw.spex.emp.vo.JobVo;
import co.hw.spex.emp.vo.DeptVo;

public interface EmpMapper {
	public EmpVo getEmp(EmpVo vo);
	public List<DeptVo> getDept();
	public List<JobVo> getJob();

}
