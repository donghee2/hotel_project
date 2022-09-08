package com.hotel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hotel.dto.BookingDTO;
import com.hotel.dto.RoomDTO;

@Mapper
public interface MainMapper {
	// 메인메이지
	List<RoomDTO> selectMainView();

}
