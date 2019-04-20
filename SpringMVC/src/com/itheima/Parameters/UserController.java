package com.itheima.Parameters;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@RequestMapping("/selectUser1")
	public String seleteUser(HttpServletRequest request) {
		String id = request.getParameter("id");
		System.out.println(id);
		return "success";
	}
	@RequestMapping("/selectUser2")
	public String seleteUser(@RequestParam(value = "user_id") int id) {
		System.out.println(id);
		return "success";
	}

	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register";
	}
	@RequestMapping("/registerUser")
	public String registerUser(User user) {
		String username = user.getUsername();
		String password = user.getPassword();
		System.out.println(username + "---" + password);
		return "success";
	}

	@RequestMapping("/toUser")
	public String seleteUsers() {
		return "user";
	}
	@RequestMapping("/deleteUser")
	public String deleteUsers(int[] ids) {
		if (ids != null) {
			for (int id : ids)
				System.out.println(id);
		} else {
			System.out.println("null");
		}
		return "success";
	}

	@RequestMapping("/toUserEdit")
	public String toUserEdit() {
		return "user_edit";
	}
	@RequestMapping("/editUsers")
	public String editUser(UserVO userlist) {
		List<User> users = userlist.getUsers();
		for (User user : users) {
			if(user.getId()!=0)
				System.out.println(user.getId() + "---" + user.getUsername());
		}
		return "success";
	}
}
