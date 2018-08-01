package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	public UserService userService;

	@RequestMapping("/index")
	public String index(ModelMap modelMap) {
		List<User> users = userService.findAll();
		modelMap.put("users", users);
		return "userList";
	}
}