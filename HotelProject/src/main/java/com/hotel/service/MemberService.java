package com.hotel.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dto.MemberDTO;
import com.hotel.mapper.MemberMapper;

@Service
public class MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	public List<MemberDTO> selectAllMember() {
		return memberMapper.selectAllMember();
	}

	public int deleteMember(String email) {
		return memberMapper.deleteMember(email);
	}

	public int updateMember(MemberDTO dto) {
		return memberMapper.updateMember(dto);
	}

	public List<MemberDTO> searchMember(String kind, String search) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("kind", kind);
		map.put("search", search);
		return memberMapper.searchMember(map);
	}

	public MemberDTO selectMember(String email) {
		return memberMapper.selectMember(email);
	}

	public int selectGenderCount(String gender) {
		return memberMapper.selectGenderCount(gender);
	}

	public int selectMonthCount(Map<String, String> map) {
		return memberMapper.selectMonthCount(map);
	}

}
