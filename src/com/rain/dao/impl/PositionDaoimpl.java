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
import com.rain.entity.Time;

public class PositionDaoimpl implements PositionDao {

	ConnectionManager connectionManager = new ConnectionManager();
	Connection connection = (Connection) connectionManager.openConnection();
	SQLManager sqlManager = new SQLManager();
	
	public Position query(int pno){
		
		String strSQL = "select pno,px/0.09*0.055,py/0.09*0.055 from position where pno=?";
		
		Object[] params = {pno};
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		try {
			Position position = new Position();
			while(rs.next()){
				position.setPno(rs.getInt(1));
				position.setPx(rs.getDouble(2));
				position.setPy(rs.getDouble(3));
			}
			return position;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Time querytime(){
		
		
		String strSQL = "select max(month),year from record where year in (select max(year) from record)";
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, new Object[] {});
		
		try {
			Time time = new Time();
			while(rs.next()){
				time.setMonth(rs.getString(1));
				time.setYear(rs.getString(2));
			}
			return time;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Position> selectAll(int month,int year) {
		// TODO Auto-generated method stub
		List<Position> listPosition = new ArrayList<Position>();
		
		String strSQL = "select record.pno,ppv,pnv,pcod,pcom,pname,pinfo,px/0.09*0.055,py/0.09*0.055,pcss1,pcss2,month,year from record,position where record.pno=position.pno and year=? and month=? group by position.pno";
		
		Object[] params = {year,month};
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		
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
				position.setMonth(rs.getString(12));
				position.setYear(rs.getString(13));
				
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
				position.setYear(rs.getString(7));
				position.setMonth(rs.getString(8));
				
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
	public List<Position> selectLargeAll(int month,int year) {
		// TODO Auto-generated method stub
		List<Position> listPosition = new ArrayList<Position>();
		
		String strSQL = "select record.pno,ppv,pnv,pcod,pcom,pname,pinfo,px/0.09*0.1,py/0.09*0.1,pcss1,pcss2,month,year from record,position where record.pno=position.pno and year=? and month=? group by position.pno";
		
		Object[] params = {year,month};
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		
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
				position.setMonth(rs.getString(12));
				position.setYear(rs.getString(13));
				
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
