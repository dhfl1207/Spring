package co.hw.spex.member.service;

import java.sql.SQLException;
import java.util.ArrayList;

import co.hw.spex.member.vo.MemberVo;

public interface MemberService {
	ArrayList<MemberVo> memberList() throws SQLException; //멤버 목록 조회
	MemberVo memberSelect(MemberVo vo) throws SQLException; //멤버 한 명 조회
	int memberInsert(MemberVo vo) throws SQLException;
	int memberUpdate(MemberVo vo) throws SQLException;
	int memberDelete(MemberVo vo) throws SQLException;
	
	boolean memberLoginCheck(MemberVo vo) throws SQLException; //멤버 로그인 체크	

}
