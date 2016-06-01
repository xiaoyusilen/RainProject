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
		
		String strSQL = "select * from april,position where april.pno=position.pno group by position.pno";
		
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
				position.setPname(rs.getString(7));
				position.setPinfo(rs.getString(8));
				position.setPx(rs.getDouble(9));
				position.setPy(rs.getDouble(10));
				position.setPcss1(rs.getString(11));
				position.setPcss2(rs.getString(12));
				
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
