package com.project.blog.members.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.project.blog.members.dao.MembersDao;
import com.project.blog.members.dto.MembersDto;

@Service
public class MembersServiceImpl implements MembersService{

	@Autowired
	private MembersDao dao;
	@Override
	public void addUser(MembersDto dto) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPwd=encoder.encode(dto.getPwd());
		dto.setPwd(encodedPwd);
		dao.insert(dto);
	}

	@Override
	public void loginProcess(MembersDto dto, HttpSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInfo(HttpSession session, Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserPwd(HttpSession session, MembersDto dto, Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> saveProfileImage(HttpServletRequest request, MultipartFile mFile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(MembersDto dto, HttpSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(HttpSession session, Model model) {
		// TODO Auto-generated method stub
		
	}

}
