package com.rain.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.rain.DateSource.ConnectionManager;
import com.rain.DateSource.SQLManager;
import com.rain.dao.LineDao;
import com.rain.entity.line;
import com.rain.util.DBConnection;

public class LineDaoimpl implements LineDao {
	
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

	
	public ArrayList<Integer> selectSX(String t) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Position = new ArrayList<Integer>();
		
		String strSQL = null;
		strSQL="select pno from riversys where sx=? order by orderno";
		
		Object[] params = {t};
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		
		
		try {
			while(rs.next())
			{
				Position.add(rs.getInt("pno"));
			}
			return Position;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public line select(String type, String year, String month, int pno) {
		// TODO Auto-generated method stub
		
		line line1 = null;
		
		String strSQL = null;
		
		if(type.equals("ppv"))
		{
			strSQL="select pno,ppv,year,month from record where year=? and month=? and pno=?";
		}
		else if(type.equals("pnv"))
		{
			strSQL="select pno,pnv,year,month from record where year=? and month=? and pno=?";
		}
		else if(type.equals("pcod"))
		{
			strSQL="select pno,pcod,year,month from record where year=? and month=? and pno=?";
		}
		
		Object[] params = {year,month,pno};
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		
		
		try {
			while(rs.next())
			{
				if(type.equals("ppv"))
				{
					line1 = new line(rs.getInt("pno"),rs.getDouble("ppv"),rs.getString("year"),rs.getString("month"));
				}
				else if(type.equals("pnv"))
				{
					line1 = new line(rs.getInt("pno"),rs.getDouble("pnv"),rs.getString("year"),rs.getString("month"));
				}
				else if(type.equals("pcod"))
				{
					line1 = new line(rs.getInt("pno"),rs.getDouble("pcod"),rs.getString("year"),rs.getString("month"));
				}
			}
			return line1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}