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
	
	public List<line> selectAll(int pno,String type) {
		// TODO Auto-generated method stub
		List<line> listLine = new ArrayList<line>();
		
		String strSQL = null;
		if(type.equals("ppv"))
		{
			strSQL = "select ppv,year,month from record where pno=? group by month";
		}
		else if(type.equals("pnv"))
		{
			strSQL = "select pnv,year,month from record where pno=? group by month";
		}
		else if(type.equals("pcod"))
		{
			strSQL = "select pcod,year,month from record where pno=? group by month";
		}
		
		Object[] params = {pno};
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		
		
		try {
			while(rs.next())
			{
				line line1 = new line();
				line1.setData(rs.getDouble(1));
				line1.setYear(rs.getString(2));
				line1.setMonth(rs.getString(3));
				
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