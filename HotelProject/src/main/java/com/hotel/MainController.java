package com.hotel;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.dto.BookingDTO;
import com.hotel.dto.HotelDTO;
import com.hotel.dto.RoomDTO;
import com.hotel.service.MainService;

@Controller
public class MainController {
	private MainService mainservice;

	public MainController(MainService mainservice) {
		this.mainservice = mainservice;
	}
	
	@RequestMapping("/")
	public String mainpage(Model model) {
		List<RoomDTO> mainlist = mainservice.selectMainView();
		System.out.println(mainlist);
		System.out.println(mainlist.size());
		model.addAttribute("mainlist", mainlist);
		return "index";
	}
	
	@RequestMapping("/hotelDetailView.do")
	public String hotelDetailView(Model model) {
		List<HotelDTO> hotellist = mainservice.selectHotelView();
		System.out.println(hotellist);
		model.addAttribute("hotellist", hotellist);
		return "hotel_detail_view";
	}
	
	@RequestMapping("/roomDetailView.do")
	public String roomDetailView(Model model) {
		List<RoomDTO> roomlist = mainservice.selectRoomView();
		List<HotelDTO> hotellist = mainservice.selectHotelView();
		System.out.println(roomlist);
		System.out.println(hotellist);
		model.addAttribute("roomlist", roomlist);
		model.addAttribute("hotellist", hotellist);
		return "room_detail_view";
	}
}
