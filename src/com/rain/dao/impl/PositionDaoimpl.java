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
		
		String strSQL = "select * from record,position where record.pno=position.pno group by position.pno";
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, new Object[] {});
		
		try {
			while(rs.next())
			{
				Position position = new Position();
				position.setPno(rs.getInt(2));
				position.setPpv(rs.getDouble(3));
				position.setPnv(rs.getDouble(4));
				position.setPcod(rs.getDouble(5));
				position.setPcom(rs.getDouble(6));
				position.setPname(rs.getString(10));
				position.setPinfo(rs.getString(11));
				position.setPx(rs.getDouble(12));
				position.setPy(rs.getDouble(13));
				position.setPcss1(rs.getString(14));
				position.setPcss2(rs.getString(15));
				
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
