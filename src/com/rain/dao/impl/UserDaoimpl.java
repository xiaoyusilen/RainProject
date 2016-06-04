package com.rain.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.rain.DateSource.*;
import com.rain.entity.User;

public class UserDaoimpl {
	ConnectionManager connectionManager = new ConnectionManager();
	Connection connection = (Connection) connectionManager.openConnection();
	SQLManager sqlManager = new SQLManager();
	public boolean LoginValidate(User user)
	{
		String username = user.getUsername();
		String password = user.getPassword();
		String strSQL = "select * from user where username=? and password=?";
		Object[] params = {username,password};
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		try {
			if(rs.next())
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
