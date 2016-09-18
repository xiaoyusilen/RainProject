package com.rain.dao;

import java.util.ArrayList;
import java.util.List;

import com.rain.entity.line;

public interface LineDao {
	
	public List<line> selectAll(int pno,String type);
	public ArrayList<Integer> selectSX(String t);
	public line select(String type,String year,String month,int pno);
	public List<line> selectsurface(int pno,String type);
}
