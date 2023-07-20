package com.project.blog.members.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.project.blog.members.dto.MembersDto;



public interface MembersService {

	//회원한명의정보를 추가하는메소드
		public void addUser(MembersDto dto);
		public void loginProcess(MembersDto dto, HttpSession session);
		public void getInfo(HttpSession session, Model model);
		public void updateUserPwd(HttpSession session, MembersDto dto, Model model);
		public Map<String, Object> saveProfileImage(HttpServletRequest request, 
		         MultipartFile mFile);
		public void updateUser(MembersDto dto, HttpSession session);
		public void deleteUser(HttpSession session, Model model);
}
