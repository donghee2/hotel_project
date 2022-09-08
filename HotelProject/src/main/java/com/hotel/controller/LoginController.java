package com.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	private String folder = "login/";
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "로그인");
		model.addAttribute("page", makeFileName("login"));

		return "layout/template";
	}
	
	@RequestMapping("/find-id")
	public String findId(Model model) {
		model.addAttribute("title", "아이디 찾기");
		model.addAttribute("page", makeFileName("id"));

		return "layout/template";
	}
	
	@RequestMapping("/find-pw")
	public String findPw(Model model) {
		model.addAttribute("title", "비밀번호 찾기");
		model.addAttribute("page", makeFileName("pw"));

		return "layout/template";
	}
	
	private String makeFileName(String fileName) {
		return folder + fileName;
	}
}








