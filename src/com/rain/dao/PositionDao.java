package com.rain.dao;

import java.util.List;

import com.rain.entity.Position;


public interface PositionDao {
	public List<Position> selectAll();
	public List<Position> query(int year,int month,String type,String way,Double view);
}
