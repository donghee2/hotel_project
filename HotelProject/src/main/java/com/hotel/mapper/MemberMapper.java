package com.hotel.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hotel.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	int insertMember(MemberDTO member);
	MemberDTO matchMember(@Param("email") String email, @Param("password") String password);
	
	List<MemberDTO> selectMemberId(HashMap<Object, Object> map);
}
