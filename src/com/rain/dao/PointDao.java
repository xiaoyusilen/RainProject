package com.rain.dao;

import java.util.List;

import com.rain.entity.Point;
import com.rain.entity.Position;
import com.rain.entity.Time;

public interface PointDao {

	public List<Point> selectAll(int year,int month);
	public Time querytime();
	public int insert(Point point);
	public Point querybyid(String pno,String year,String month);
	public int update(String pno,String rph,String rnh,String rkm,String rcod,String rdo,String rbod,String rwt,String rxf,String ryls,String rtp,String rtn,String year,String month);
	public int delete(String pno,String year,String month);
	
}
