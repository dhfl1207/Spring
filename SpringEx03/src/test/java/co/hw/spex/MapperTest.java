package co.hw.spex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.hw.spex.member.service.impl.MemberMapper;
import co.hw.spex.member.vo.DeptVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:datasource-context.xml")
public class MapperTest {
	@Autowired
	MemberMapper dao;
	
	@Test
	public void insTest() {
		DeptVO vo = new DeptVO();
		vo.setDapartmentName("총무");
		dao.deptIns(vo);
		assertEquals(vo.getOutMsg(), "SUCCESS");
	}
	
	
	
	

}
