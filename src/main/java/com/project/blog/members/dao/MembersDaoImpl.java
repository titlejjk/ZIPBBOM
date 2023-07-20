package com.project.blog.members.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.blog.members.dto.MembersDto;

@Repository
public class MembersDaoImpl implements MembersDao{

	
	@Autowired
	private SqlSession session;
	@Override
	public boolean isExist(String inputId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insert(MembersDto dto) {
		session.insert("members.insert", dto);
	}

	@Override
	public MembersDto getData(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePwd(MembersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MembersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
