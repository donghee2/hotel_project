package com.hotel.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hotel.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	int insertMember(MemberDTO member);
	MemberDTO matchMember(@Param("email") String email, @Param("password") String password);
}
