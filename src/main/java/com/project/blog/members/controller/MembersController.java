package com.project.blog.members.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.blog.members.dto.MembersDto;
import com.project.blog.members.service.MembersService;

@Controller
public class MembersController {

	@Autowired
	private MembersService service;
	
	@PostMapping("/members/join")
	public String join(MembersDto dto) {
		service.addUser(dto);
		return "members/join";
	}
	
	@GetMapping("/members/joinform")
	public String joinForm() {
		return "members/joinform";
	}
	
	@GetMapping("/members/login_form")
	public String loginForm() {
		return "members/login_form";
	}
}
