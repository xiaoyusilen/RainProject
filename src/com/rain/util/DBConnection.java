package com.rain.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private void getConnection()
	{
		Context context;
		try {
			context = new InitialContext();
			DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/rain");
			this.conn=ds.getConnection();
			if(this.conn!=null)
			{
				System.out.println("成功");
			}
			} catch (  Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("失败");
			}
	}
	public  void closeConnection()
	{
		if(this.rs!=null)
		{
			try {
				this.rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(this.pstmt!=null)
		{
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(this.conn!=null)
		{
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public ResultSet execQuery(final String strSQL, final Object... params) {
		this.getConnection();
		System.out.println("SQL:-->" + strSQL);

		try {
			this.pstmt = this.conn.prepareStatement(strSQL);
			for (int i = 0; i < params.length; i++) {
				this.pstmt.setObject(i + 1, params[i]);
			}
			this.rs = this.pstmt.executeQuery();

			return this.rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public int execOther(final String strSQL, final Object... params) {
		this.getConnection();
		System.out.println("SQL:-->" + strSQL);
		try {
			this.pstmt = this.conn.prepareStatement(strSQL);

			for (int i = 0; i < params.length; i++) {
				this.pstmt.setObject(i + 1, params[i]);
			}

			int affectRows = this.pstmt.executeUpdate();
			return affectRows;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	public static void main(String[] args) {
		DBConnection conn = new DBConnection();
		conn.getConnection();
	}
}
