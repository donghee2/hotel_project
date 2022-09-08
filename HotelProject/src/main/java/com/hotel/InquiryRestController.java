package com.hotel;

import java.util.HashMap;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dto.MemberDTO;
import com.hotel.model.LoginRequest;
import com.hotel.model.LogoutRequest;
import com.hotel.service.InquiryService;
import com.hotel.service.MemberService;

@RestController
public class InquiryRestController {
	@Autowired
	InquiryService inquiryService;
	
	@PostMapping("/inquirys")
	public HashMap<String, String> add(HttpServletRequest request, @ModelAttribute LoginRequest loginRequest, Model model) throws Exception {
		inquiryService.insertInquiry();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "true");

		return map;
	}
}








