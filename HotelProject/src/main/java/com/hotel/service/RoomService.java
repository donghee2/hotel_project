package com.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.dto.HotelDTO;
import com.hotel.dto.RoomDTO;
import com.hotel.mapper.RoomMapper;

@Service
public class RoomService {
	private RoomMapper roommapper;

	public RoomService(RoomMapper roommapper) {
		this.roommapper = roommapper;
	}

	public List<RoomDTO> selectAllRoom() {
		return roommapper.selectAllRoom();
	}

	public List<RoomDTO> selectRoomOption(String roomNo) {
		return roommapper.selectRoomOption(roomNo);
	}

	public RoomDTO selectOneRoom(String roomNo) {
		return roommapper.selectOneRoom(roomNo);
	}

	public String selectHotelName(String hotelNo) {
		return roommapper.selectHotelName(hotelNo);
	}

	public List<RoomDTO> selectHotelList() {
		return roommapper.selectHotelList();
	}
	
	
	
}
