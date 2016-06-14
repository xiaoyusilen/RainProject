package com.rain.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.rain.DateSource.ConnectionManager;
import com.rain.DateSource.SQLManager;
import com.rain.dao.PointDao;
import com.rain.entity.Point;
import com.rain.entity.Position;

public class PointDaoimpl implements PointDao {
	
	ConnectionManager connectionManager = new ConnectionManager();
	Connection connection = (Connection) connectionManager.openConnection();
	SQLManager sqlManager = new SQLManager();
	
	public List<Point> selectAll() {
		List<Point> listPoint = new ArrayList<Point>();
		
		String strSQL = "select record.pno,ppv,pnv,pcod,pcom,pname,pinfo,px/0.09*0.055,py/0.09*0.055,pcss1,pcss2 from record,position where record.pno=position.pno group by position.pno";
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, new Object[] {});
		
		try {
			while(rs.next())
			{
				Point point = new Point();
				/*position.setPno(rs.getInt(1));
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
				
				listPoint.add(position);*/
			}
			return listPoint;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			connectionManager.closeConnection(connection);
		}
	}

}
