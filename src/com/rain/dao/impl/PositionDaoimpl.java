package com.rain.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rain.util.DBConnection;
import com.mysql.jdbc.Connection;
import com.rain.DateSource.ConnectionManager;
import com.rain.DateSource.SQLManager;
import com.rain.dao.PositionDao;
import com.rain.entity.Position;

public class PositionDaoimpl implements PositionDao {

	ConnectionManager connectionManager = new ConnectionManager();
	Connection connection = (Connection) connectionManager.openConnection();
	SQLManager sqlManager = new SQLManager();
	
	public List<Position> selectAll() {
		// TODO Auto-generated method stub
		List<Position> listPosition = new ArrayList<Position>();
		
		String strSQL = "select record.pno,ppv,pnv,pcod,pcom,pname,pinfo,px/0.09*0.055,py/0.09*0.055,pcss1,pcss2 from record,position where record.pno=position.pno group by position.pno";
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, new Object[] {});
		
		try {
			while(rs.next())
			{
				Position position = new Position();
				position.setPno(rs.getInt(1));
				position.setPpv(rs.getDouble(2));
				position.setPnv(rs.getDouble(3));
				position.setPcod(rs.getDouble(4));
				position.setPcom(rs.getDouble(5));
				position.setPname(rs.getString(6));
				position.setPinfo(rs.getString(7));
				position.setPx(rs.getDouble(8));
				position.setPy(rs.getDouble(9));
				position.setPcss1(rs.getString(10));
				position.setPcss2(rs.getString(11));
				
				listPosition.add(position);
			}
			return listPosition;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			connectionManager.closeConnection(connection);
		}
	}

	@Override
	public List<Position> query(int year, int month, String type, String way, Double view) {
		// TODO Auto-generated method stub
		List<Position> listPosition = new ArrayList<Position>();
		String strSQL = null;
		if(way.equals("="))
		{
			if(type.equals("ppv"))
				strSQL="select * from record where year=? and month=? and ppv=?";
			else if(type.equals("pnv"))
				strSQL = "select * from record where year=? and month=? and pnv=?";
			else if(type.equals("pcod"))
				strSQL = "select * from record where year=? and month=? and pcod=?";
		}
		else if(way.equals(">"))
		{
			if(type.equals("ppv"))
				strSQL="select * from record where year=? and month=? and ppv>?";
			else if(type.equals("pnv"))
				strSQL = "select * from record where year=? and month=? and pnv>?";
			else if(type.equals("pcod"))
				strSQL = "select * from record where year=? and month=? and pcod>?";
		}
		else if(way.equals("<"))
		{
			if(type.equals("ppv"))
				strSQL="select * from record where year=? and month=? and ppv<?";
			else if(type.equals("pnv"))
				strSQL = "select * from record where year=? and month=? and pnv<?";
			else if(type.equals("pcod"))
				strSQL = "select * from record where year=? and month=? and pcod<?";
		}
		
		Object[] params = {year,month,view};
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		
		try {
			while(rs.next())
			{
				Position position = new Position();
				position.setPno(rs.getInt(2));
				position.setPpv(rs.getDouble(3));
				position.setPnv(rs.getDouble(4));
				position.setPcod(rs.getDouble(5));
				
				listPosition.add(position);
			}
			return listPosition;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			connectionManager.closeConnection(connection);
	}
	}
}
