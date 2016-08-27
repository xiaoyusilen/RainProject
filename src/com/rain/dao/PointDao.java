package com.rain.dao;

import java.util.List;

import com.rain.entity.Point;
import com.rain.entity.Position;
import com.rain.entity.Time;

public interface PointDao {

	public List<Point> selectAll(int year,int month);
	public Time querytime();
}
