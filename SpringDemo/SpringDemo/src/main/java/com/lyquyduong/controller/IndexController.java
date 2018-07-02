package com.lyquyduong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lyquyduong.model.UserDTO;
import com.lyquyduong.service.UserService;

@Controller
public class IndexController {

	UserService uService;
	
//	@RequestMapping(value = "/*", method = RequestMethod.GET)
//	public String test(){
//		return "index";
//	}
//	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String login(){
		return "Login";
	}
	
	@RequestMapping(value="/processLogin", method= RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam(value="user") String user,  @RequestParam(value="user") String pass){
		ModelAndView model= new ModelAndView("Login");
		UserDTO u = uService.getByUsername(user);
		if(u.getId() > 0 && u.getPassword().equalsIgnoreCase(pass)){
			model = new ModelAndView("home");
		}else{
			model.addObject("msg", "wrong user or pass!!!");
			model = new ModelAndView("Login");
		}
		return model;
	}

	public UserService getuService() {
		return uService;
	}
	
	@Autowired
	public void setuService(UserService uService) {
		this.uService = uService;
	}
	
	
}
