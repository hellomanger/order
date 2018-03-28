package com.order.service;

import java.util.List;
import java.util.Map;

import com.order.domain.UserDO;

public interface UserService {
	
	UserDO get(Integer id);
	
	List<UserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	
	
	
}
