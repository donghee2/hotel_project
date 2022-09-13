package com.hotel.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dto.MemberDTO;
import com.hotel.mapper.MemberMapper;
import com.hotel.model.JoinRequest;
import com.hotel.model.LoginRequest;

@Service
public class MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	public void insertMember(JoinRequest join) {
		MemberDTO memberDTO = new MemberDTO(join.getEmail(), join.getName(), join.getPassword(), join.getGender(),
											join.getBirth(), join.getTel(), join.getAddress());
		memberMapper.insertMember(memberDTO);
	}
	
	public MemberDTO matchMember(LoginRequest loginRequest) {
		return memberMapper.matchMember(loginRequest.getEmail(), loginRequest.getPassword());
	}

	public List<MemberDTO> selectMemberId(String memberName, String tel) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("memberName", memberName);
		map.put("tel", tel);
		System.out.println("service" + map);
		return memberMapper.selectMemberId(map);
	}
}
