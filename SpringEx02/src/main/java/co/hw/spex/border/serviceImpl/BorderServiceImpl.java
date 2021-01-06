package co.hw.spex.border.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.hw.spex.border.service.BorderDao;
import co.hw.spex.border.service.BorderService;
import co.hw.spex.border.vo.BorderVo;

@Service("borderService")
public class BorderServiceImpl implements BorderService {
   
   @Autowired
   private BorderDao dao;
   
   @Override
   public ArrayList<BorderVo> selectList() {
      // TODO Auto-generated method stub
      return dao.selectList();
   }



	@Override
	public BorderVo select(BorderVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BorderVo vo) {
		int n = 0;
		n = dao.insert(vo);
		return n;
	}

	@Override
	public int delete(BorderVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BorderVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
