package com.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.dto.BookingDTO;
import com.hotel.mapper.BookingMapper;

@Service
public class BookingService {
	private BookingMapper bookingmapper;

	public BookingService(BookingMapper bookingmapper) {
		this.bookingmapper = bookingmapper;
	}
	// 객실예약
	public int insertRoomBooking(BookingDTO bdto) {
		return bookingmapper.insertRoomBooking(bdto);
	}
	// 위시리스트
	public List<BookingDTO> selectWishlistView(String email) {
		return bookingmapper.selectWishlistView(email);
	}
	
	// 예약할 객실
	public List<BookingDTO> selectBookingView(String roomNo) {
		return bookingmapper.selectBookingView(roomNo);
	}
	
	
	
}
