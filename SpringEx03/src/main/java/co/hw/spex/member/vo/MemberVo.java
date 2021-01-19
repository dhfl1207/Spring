package co.hw.spex.member.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVo {
	private String memberId;
	private String memberName;
	@JsonIgnore private String password;
	private String memberAuth;
	private int memberPoint;
	

}
