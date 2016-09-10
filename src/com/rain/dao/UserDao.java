package com.rain.dao;

import com.rain.entity.User;

public interface UserDao {

	public boolean LoginValidate(User user);
	public int modify(String pass,String oldpass);
}
