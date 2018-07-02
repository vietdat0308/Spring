package com.lyquyduong.dao;

import com.lyquyduong.model.UserDTO;

public interface UserDAO {

	public UserDTO getByUsername(String user);
}
