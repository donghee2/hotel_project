package com.hotel.dto;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;

@Alias("member")
public class MemberDTO {
	private String email;
	private String memberName;
	private String password;
	private String gender;
	private LocalDate birth;
	private String tel;
	private String address;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}
	
	public MemberDTO() {
	
	}

	public MemberDTO(String email, String memberName, String password, String gender, LocalDate birth, String tel, String address) {
		this.email = email;
		this.memberName = memberName;
		this.password = password;
		this.gender = gender;
		this.birth = birth;
		this.tel = tel;
		this.address = address;
	}

	
}
