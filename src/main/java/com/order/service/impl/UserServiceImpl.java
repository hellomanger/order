package com.order.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.UserDao;
import com.order.domain.UserDO;
import com.order.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDO get(Integer id) {
		return userDao.get(id);
	}

	@Override
	public List<UserDO> list(Map<String, Object> map) {
		return userDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return userDao.count(map);
	}

}
