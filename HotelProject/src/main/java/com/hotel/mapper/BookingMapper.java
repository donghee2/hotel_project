package com.hotel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hotel.dto.BookingDTO;

@Mapper
public interface BookingMapper {
	// 객실 예약
	int insertRoomBooking(BookingDTO bdto);
	// 위시리스트 객실 정보
	List<BookingDTO> selectWishlistView(String email);
	// 예약하려는 객실 정보
	List<BookingDTO> selectBookingView(String roomNo);

}