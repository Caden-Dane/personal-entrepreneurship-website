package com.xbj.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xbj.website.dao.UserDao;
import com.xbj.website.model.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoTest.class);
	
	@Autowired
	private UserDao userDao;
	
	
	@Test
	public void getUserById() {
		User user = userDao.findUserById(2l);
		LOGGER.info("的用户信息："+user);
	}

}
