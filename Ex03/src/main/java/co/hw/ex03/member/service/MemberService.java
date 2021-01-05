package co.hw.ex03.member.service;

import java.util.ArrayList;

import co.hw.ex03.member.vo.MemberVo;

public interface MemberService {
	ArrayList<MemberVo> selectAll();
	MemberVo select(MemberVo vo);
	int insert(MemberVo vo);
	int update(MemberVo vo);
	int delect(MemberVo vo);

}
