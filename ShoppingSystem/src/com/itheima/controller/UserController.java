package com.itheima.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itheima.po.User;
import com.itheima.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
// 用户注册	
	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register";
	}
	@RequestMapping("/registerUser")
	public String registerUser(User user,Model model) {
		String username=user.getUsername();
		if(!username.isEmpty() && !user.getPassword().isEmpty()) {
			User user2=userService.findUserByName(username);
			if(user2!=null) {
				model.addAttribute("zhuce","用户名已存在，请重新注册！");
				return "register";
			}else 		
				userService.addUser(user);
			return "redirect:login";
		}else {
			model.addAttribute("zhuce","注册信息为空，请重新注册！");
			return "register";
		}
	}
	
// 用户登录与退出	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String toLogin() {
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user,Model model,HttpSession session) {
		String username=user.getUsername();
		String password=user.getPassword();
		User user2=findUserByName(username);
		if(user2!=null && user2.getPassword().equals(password)) {
			session.setAttribute("USER_SESSION", user);
			return "redirect:main";
		}
		model.addAttribute("msg","用户名或密码错误，请重新登录！");
		return "login";
	}
	@RequestMapping(value="/main")
	public String toMain() {
		return "main";
	}
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
	// 	根据用户名查找用户
	public User findUserByName(String username) {
		User user=userService.findUserByName(username);
		return user;
	}
}
