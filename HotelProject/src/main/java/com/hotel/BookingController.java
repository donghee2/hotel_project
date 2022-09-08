package com.hotel;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.dto.BookingDTO;
import com.hotel.service.BookingService;

@Controller
public class BookingController {
	private BookingService bookingservice;
	
	
	public BookingController(BookingService bookingservice) {
		this.bookingservice = bookingservice;
	}
// -------------------------------------------------------------동희------------------------------------------------------
	// 위시리스트
	@RequestMapping("wishlist.do")
	public String wishlist(Model model, HttpSession session) {
		String email = (String) session.getAttribute("email");
		List<BookingDTO> wishlist = bookingservice.selectWishlistView(email);
//		System.out.println(wishlist.toString());
//		System.out.println(wishlist.size());
		model.addAttribute("wishlist", wishlist);
		return "dh/wishlist";
	}
	
	@RequestMapping("/bookingView.do")
	public String bookingView(Model model, HttpSession session, String roomNo) {
//		String email = (String) session.getAttribute("email"); 
		List<BookingDTO> roomlist = bookingservice.selectBookingView(roomNo);
		
//		System.out.println(roomlist.toString());
		model.addAttribute("roomlist", roomlist);
		return "dh/booking";
	}
	
	
	// 객실예약
	@RequestMapping("/booking.do")
	public String insertBooking(BookingDTO bdto, String checkInOut) {
		System.out.println(checkInOut);
		String[] arr = checkInOut.split(" - ");
		String checkIn = arr[0];
		String checkOut = arr[1];
		checkIn = checkIn.replace("/", "");
		checkOut = checkOut.replace("/", "");
		bdto.setCheckIn(checkIn);
		bdto.setCheckOut(checkOut);
		System.out.println(bdto);
		bookingservice.insertRoomBooking(bdto);
		return "redirect:/";
	}
}


//-------------------------------------------------------------동희------------------------------------------------------





