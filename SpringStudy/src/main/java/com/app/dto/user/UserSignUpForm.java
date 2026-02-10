package com.app.dto.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserSignUpForm {

	// 필수입력 빈칸X
	@NotBlank(message = "아이디 필수임")
	String id;

	// 비번 길이제한
	@Size(min = 8, max = 12, message = "비번 길이 확인!!!")
	String pw;
	String name;
	String userType;
	// 사용자 계정 구분
	// Customer Admin
	// CUS ADM
}
