package com.xf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xf.pojo.User;
import com.xf.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userservice;
	@RequestMapping("/query")
	public String queryUserList(Model model) {
		// TODO Auto-generated method stub
	List<User> list=userservice.queryUserList();
	model.addAttribute("list", list);
	return "ListQuery";
	}
}
