package com.lyquyduong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyquyduong.dao.UserDAO;
import com.lyquyduong.model.UserDTO;


@Service
public class UserServiceImpl implements UserService {

	UserDAO u;
	
	@Override
	public UserDTO getByUsername(String user) {
		return u.getByUsername(user);
	}

	public UserDAO getU() {
		return u;
	}

	@Autowired
	public void setU(UserDAO u) {
		this.u = u;
	}

	
}
