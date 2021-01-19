package co.hw.spex.member.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.hw.spex.member.service.MemberRowMapper;
import co.hw.spex.member.service.MemberService;
import co.hw.spex.member.vo.MemberVo;

//@Repository("memberDao")
public class MemberDao implements MemberService {
	
	@Autowired  //스프링 컨테이너어 등록된 bean을 찾아서 연결한다.
	private JdbcTemplate jdbcTamplate;
	
	@Override
	public ArrayList<MemberVo> memberList(MemberVo vo) throws SQLException{
		String sql = "select * from member";
		ArrayList<MemberVo> list = (ArrayList<MemberVo>) jdbcTamplate.query(sql, new MemberRowMapper()); 
		//여러개를 가지고 오는 쿼리 jdbcTamplate.query라고 쓴다.
		return list;
	}

	@Override
	public MemberVo memberSelect(MemberVo vo) throws SQLException{
		String sql = "select * from member where memberid = ?";
		Object[] args = {vo.getMemberId()}; //object배열을 원하니까 중괄호를 씌워서 표현
		//{vo.getMemberId(), vo.getPassword()} 두개 들어가면 이렇게 씀
		return jdbcTamplate.queryForObject(sql, args, new MemberRowMapper());
	}

	@Override
	public int memberInsert(MemberVo vo) throws SQLException{
		String sql = "insert into member(memberid, membername, password, memberauth) values(?,?,?,?)";
		Object[] args = {vo.getMemberId(), vo.getMemberName(), vo.getPassword(), vo.getMemberAuth()};
		return jdbcTamplate.update(sql, args);
	}

	@Override
	public int memberUpdate(MemberVo vo) throws SQLException{
		String sql = "update member set password = ?, memberauth = ? where memberid = ?";
		return jdbcTamplate.update(sql, vo.getPassword(), vo.getMemberAuth(), vo.getMemberId());
	}

	@Override
	public int memberDelete(MemberVo vo) throws SQLException {
		String sql = "delete from member where memberid = ?";
		return jdbcTamplate.update(sql, vo.getMemberId());
	}

	@Override
	public boolean memberLoginCheck(MemberVo vo) throws SQLException{
		boolean check = false;
		String sql = "select count(*) from member where memberid = ? and password = ?";
		Object[] args = {vo.getMemberId(), vo.getPassword()};
		int n = jdbcTamplate.queryForObject(sql, args, Integer.class);
		if(n != 0) check = true;
		return check;
	}
	
}
