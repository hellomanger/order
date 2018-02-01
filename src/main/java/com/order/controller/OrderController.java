package com.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/order")
@Controller
public class OrderController {
	
	@RequestMapping("/index")
	String welcome(Model model) {
		return "index";
	}
}
