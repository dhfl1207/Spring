package co.hw.ex03.member.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.hw.ex03.member.service.MemberDao;
import co.hw.ex03.member.service.MemberService;
import co.hw.ex03.member.vo.MemberVo;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;

	@Override
	public ArrayList<MemberVo> selectAll() {
		return dao.selectAll();
	}

	@Override
	public MemberVo select(MemberVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delect(MemberVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
