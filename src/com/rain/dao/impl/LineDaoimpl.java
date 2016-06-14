package com.rain.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.rain.DateSource.ConnectionManager;
import com.rain.DateSource.SQLManager;
import com.rain.entity.line;
import com.rain.util.DBConnection;

public class LineDaoimpl {
	
	ConnectionManager connectionManager = new ConnectionManager();
	Connection connection = (Connection) connectionManager.openConnection();
	SQLManager sqlManager = new SQLManager();
	
	public List<line> selectAll() {
		// TODO Auto-generated method stub
		List<line> listLine = new ArrayList<line>();
		
		String strSQL = "select pno,ppv,pnv,pcod from record";
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, new Object[] {});
		
		
		try {
			while(rs.next())
			{
				line line1 = new line();
				line1.setPno(rs.getInt(1));
				line1.setPpv(rs.getDouble(2));
				line1.setPnv(rs.getDouble(3));
				line1.setPcod(rs.getDouble(4));
				
				listLine.add(line1);
			}
			return listLine;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			connectionManager.closeConnection(connection);
		}
	}

}