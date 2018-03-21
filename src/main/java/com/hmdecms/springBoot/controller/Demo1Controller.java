package com.hmdecms.springBoot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmdecms.springBoot.model.User;
import com.hmdecms.springBoot.service.SpingBootService;

@Controller
public class Demo1Controller {
	
		@Resource
		private SpingBootService demoService;
	
		@RequestMapping(value="test")
		@ResponseBody
		public String test(){
			return demoService.Demo1dayService();
			
		}
		@RequestMapping(value="/listUser")
		public String listUser(Model model){
			List<User> userList = new ArrayList<User>();
			for (int i = 0; i <10; i++) {
	            userList.add(new User(i,"一只特立独行的研究者"+i,"20"+i,"中国长沙"));
	        }
			model.addAttribute("users", userList);
			return "/user/list";
			
		}
}
