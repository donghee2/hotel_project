package com.hotel.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hotel.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	int insertMember(MemberDTO member);
	MemberDTO matchMember(@Param("email") String email, @Param("password") String password);
	List<MemberDTO> selectAllMember();
	int deleteMember(String email);
	int updateMember(MemberDTO dto);
	List<MemberDTO> searchMember(Map<String, Object> map);
	MemberDTO selectMember(String email);
}
