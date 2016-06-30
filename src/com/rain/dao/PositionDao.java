package com.rain.dao;

import java.util.List;

import com.rain.entity.Position;
import com.rain.entity.Time;


public interface PositionDao {
	public List<Position> selectAll(int month,int year);
	public List<Position> selectLargeAll(int month,int year);
	public List<Position> query(int year,int month,String type,String way,Double view);
	public Time querytime();
	public Position query(int pno);
}
