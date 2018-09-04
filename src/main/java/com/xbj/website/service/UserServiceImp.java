package com.xbj.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xbj.website.dao.UserDao;
import com.xbj.website.model.User;

@Service("UserService")
public class UserServiceImp implements UserService{

	@Autowired
	private UserDao userDao;

	
	
	@Override
	public User findUserById(Long id) {
		return userDao.findUserById(id);
	}



	@Override
	public User findUserByNickName(String nickName) {
		return userDao.findUserByNickName(nickName);
	}

}
