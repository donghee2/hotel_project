package com.hotel.dto;


import org.apache.ibatis.type.Alias;
@Alias("member")
public class MemberDTO {
	private String email;
	private String password;
	private String memberName;
	private String birth;
	private String gender;
	private String tel;
	private String address;
	
	public MemberDTO() {
	}
	
	public MemberDTO(String email, String password, String memberName, String birth, String gender, String tel,
			String address) {
		super();
		this.email = email;
		this.password = password;
		this.memberName = memberName;
		this.birth = birth;
		this.gender = gender;
		this.tel = tel;
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberDTO [email=" + email + ", password=" + password + ", memberName=" + memberName + ", birth="
				+ birth + ", gender=" + gender + ", tel=" + tel + ", address=" + address + "]";
	}
	

	
}
