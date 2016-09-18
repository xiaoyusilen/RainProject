package com.rain.dao;

import java.util.List;

import com.rain.entity.Position;
import com.rain.entity.Time;


public interface PositionDao {
	public List<Position> selectAll(String month,String year);
	public List<Position> selectLargeAll(int month,int year);
	public List<Position> query(int year,int month,String type,String way,Double view);
	public Time querytime();
	public Position query(int pno);
	public Position querybyid(String pno,String year,String month);
	public int update(String pno,String ppv,String pnv,String pcod,String pcom,String year,String month);
	public int insert(Position position);
	public int delete(String pno,String year,String month);
	public int querybyId(String pno,String year,String month);
	public List<Position> selectall(String month,String year);
}
