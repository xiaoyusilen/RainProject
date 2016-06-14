package com.rain.dao;

import java.util.List;

import com.rain.entity.line;

public interface LineDao {
	
	public List<line> selectAll(int pno);
	
}
