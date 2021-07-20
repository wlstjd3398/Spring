package kr.co.sboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.UserDao;
import kr.co.sboard.vo.MemberVo;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public void insertUser(MemberVo vo) {
		
	}
	public List<MemberVo> selectUsers(){
		return dao.selectUsers(); 
	}
	public MemberVo selectUser(MemberVo vo) {
		return dao.selectUser(vo);
	}
	public void updateUser(String uid) {
		
	}
	public void deleteUser(String uid) {
		
	}
}
