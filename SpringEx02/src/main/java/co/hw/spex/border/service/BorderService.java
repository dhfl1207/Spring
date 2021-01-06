package co.hw.spex.border.service;

import java.util.ArrayList;

import co.hw.spex.border.vo.BorderVo;

public interface BorderService {
	ArrayList<BorderVo> selectList(); //전체 리스트 가지고 오기
	BorderVo select(BorderVo vo);     //하나의 레코드 가지고 오기
	int insert(BorderVo vo);          //레코드 삽입, 범위 지시자가 없어서 이 프로젝트 안에서 쓰는 것으로 정해진다. 
	int delete(BorderVo vo);		  //레코드 삭제
	int update(BorderVo vo);		  //레코드 수정
}
