package co.hw.spex;

import co.hw.spex.member.vo.MemberVo;

public class LombokTest {

	public static void main(String[] args) {
		MemberVo vo = MemberVo.builder()
				.memberId("ddd")
				.password("111")
				.build();

	}

}
