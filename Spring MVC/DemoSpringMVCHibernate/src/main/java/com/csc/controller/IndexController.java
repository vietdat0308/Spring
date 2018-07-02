package com.csc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csc.model.UserDTO;
import com.csc.service.UserService;

@Controller

public class IndexController {

	@Autowired
	UserService userServer;
	@RequestMapping("/create4test")
	public void index(){
		for (int i = 0; i < 100; i++) {
			UserDTO u = new UserDTO();
			u.setUsername("username"+i);
			u.setPassword("password"+i);
			userServer.saveOrUpdate(u);
		}
	}
	
	@RequestMapping("/register")
	public String createManual(){
		return "register";
	}
	
	@RequestMapping(value = "/showall", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public  ResponseEntity<ArrayList<UserDTO>> showAllUser(){
		return new ResponseEntity<ArrayList<UserDTO>>(userServer.getAll(), HttpStatus.OK);
	}
	
	
}
