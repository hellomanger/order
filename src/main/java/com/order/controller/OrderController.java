package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.order.domain.UserDO;
import com.order.service.UserService;

@RequestMapping()
@Controller
public class OrderController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping()
	String welcome(Model model) {
		//UserDO user = userService.get(1);
		//System.out.println(user.getName());
		return "index";
	}
}
