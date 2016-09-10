package com.rain.dao.impl;

import java.awt.geom.RectangularShape;
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
import com.rain.entity.Time;

public class PointDaoimpl implements PointDao {
	
	ConnectionManager connectionManager = new ConnectionManager();
	Connection connection = (Connection) connectionManager.openConnection();
	SQLManager sqlManager = new SQLManager();
	
	public int querybyId(String pno,String year,String month){
		String strSQL = "select * from pointrecord where pno=? and year=? and month=?";
		Object[] params={pno,year,month};
		ResultSet  rs = sqlManager.execQuery(connection, strSQL, params);
		Point point = new Point();
		try {
			if(rs.next()){
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public int delete(String pno,String year,String month)
	{
		String strSQL = "delete from pointrecord where pno=? and year=? and month=?";
		Object[] params = {pno,year,month};
		int affectRows = sqlManager.execUpdate(connection, strSQL, params);
		return affectRows;
	}
	
	public int update(String pno,String rph,String rnh,String rkm,String rcod,String rdo,String rbod,String rwt,String rxf,String ryls,String rtp,String rtn,String year,String month){
		
		String strSQL = "update pointrecord set rph=?,rnh=?,rkm=?,rcod=?,rdo=?,rbod=?,rwt=?,rxf=?,ryls=?,rtn=?,rtp=? where pno=? and year=? and month=?";
		Object[] params={rph,rnh,rkm,rcod,rdo,rbod,rwt,rxf,ryls,rtn,rtp,pno,year,month};
		int affectRows = sqlManager.execUpdate(connection, strSQL, params);
		connectionManager.closeConnection(connection);
		return affectRows;
	}
	
	public Point querybyid(String pno,String year,String month){
		String strSQL = "select * from pointrecord where pno=? and year=? and month=?";
		Object[] params={pno,year,month};
		ResultSet  rs = sqlManager.execQuery(connection, strSQL, params);
		Point point = new Point();
		try {
			while(rs.next()){
				point.setPno(rs.getInt(2));
				point.setRph(rs.getDouble(3));
				point.setRnh(rs.getDouble(4));
				point.setRkm(rs.getDouble(5));
				point.setRcod(rs.getDouble(6));
				point.setRdo(rs.getDouble(7));
				point.setRbod(rs.getDouble(8));
				point.setRwt(rs.getDouble(9));
				point.setRxf(rs.getDouble(10));
				point.setRyls(rs.getDouble(11));
				point.setRtn(rs.getDouble(12));
				point.setRtp(rs.getDouble(13));
				point.setYear(rs.getInt(13));
				point.setMonth(rs.getInt(14));
			}
			return point;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public int insert(Point point){
		String strSQL = "insert into pointrecord(pno,rph,rnh,rkm,rcod,rdo,rbod,rwt,rxf,ryls,rtn,rtp,year,month) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int pno = point.getPno();
		Double rph = point.getRph();
		Double rnh = point.getRnh();
		Double rkm = point.getRkm();
		Double rcod = point.getRcod();
		Double rdo = point.getRdo();
		Double rbod = point.getRbod();
		Double rwt = point.getRwt();
		Double rxf = point.getRxf();
		Double ryls = point.getRyls();
		Double rtn = point.getRtn();
		Double rtp = point.getRtp();
		int year = point.getYear();
		int month = point.getMonth();
		Object[] params = {pno,rph,rnh,rkm,rcod,rdo,rbod,rwt,rxf,ryls,rtn,rtp,year,month};
		int affectRows = sqlManager.execUpdate(connection, strSQL, params);
		System.out.println(affectRows);
		return affectRows;
	}
	
	public Time querytime(){
		
		
		String strSQL = "select max(month),year from pointrecord where year in (select max(year) from pointrecord)";
		
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
	
	
	public List<Point> selectAll(int year,int month) {
		List<Point> listPoint = new ArrayList<Point>();
		
		String strSQL = "select pointrecord.pno,pname,px*0.53,py*0.53,pcss1,pcss2,rph,rnh,rkm,rcod,rdo,rbod,rwt,rxf,ryls,rtn,rtp,year,month from point,pointrecord where pointrecord.pno=point.pno and year=? and month=? group by point.pno";
		
		Object[] params = {year,month};
		
		ResultSet rs = sqlManager.execQuery(connection, strSQL, params);
		
		try {
			while(rs.next())
			{
				Point point = new Point();
				point.setPno(rs.getInt(1));
				point.setPname(rs.getString(2));
				point.setPx(rs.getDouble(3));
				point.setPy(rs.getDouble(4));
				point.setPcss1(rs.getString(5));
				point.setPcss2(rs.getString(6));
				point.setRph(rs.getDouble(7));
				point.setRnh(rs.getDouble(8));
				point.setRkm(rs.getDouble(9));
				point.setRcod(rs.getDouble(10));
				point.setRdo(rs.getDouble(11));
				point.setRbod(rs.getDouble(12));
				point.setRwt(rs.getDouble(13));
				point.setRxf(rs.getDouble(14));
				point.setRyls(rs.getDouble(15));
				point.setRtn(rs.getDouble(16));
				point.setRtp(rs.getDouble(17));
				point.setYear(rs.getInt(18));
				point.setMonth(rs.getInt(19));
				listPoint.add(point);
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
