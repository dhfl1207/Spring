package co.hw.spex.member.serviceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.hw.spex.member.service.MemberService;
import co.hw.spex.member.vo.MemberVo;

@Repository("memberDao")
public class MemberMybatisDAO implements MemberService {
	
	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public List<MemberVo> memberList() throws SQLException {
		return sqlSession.selectList("MemberDAO.memberList");
	}

	@Override
	public MemberVo memberSelect(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberInsert(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberUpdate(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean memberLoginCheck(MemberVo vo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	

	 

}
