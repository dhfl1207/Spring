package co.hw.spex.member.service.impl;

import java.util.List;

import co.hw.spex.member.vo.DeptVO;
import co.hw.spex.member.vo.MemberVo;

public interface MemberMapper {
	void deptIns(DeptVO vo);
	List<MemberVo> memberList(MemberVo vo); //멤버 목록 조회
	MemberVo memberSelect(MemberVo vo);  //멤버 한 명 조회
	int memberInsert(MemberVo vo);
	int memberUpdate(MemberVo vo);
	int memberDelete(MemberVo vo);
}
