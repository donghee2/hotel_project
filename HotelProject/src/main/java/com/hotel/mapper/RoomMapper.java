package com.hotel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hotel.dto.RoomDTO;

@Mapper
public interface RoomMapper {

	List<RoomDTO> selectAllRoom();

	List<RoomDTO> selectRoomOption(String roomNo);

	RoomDTO selectOneRoom(String roomNo);

	String selectHotelName(String hotelNo);

	List<RoomDTO> selectHotelList();

}
