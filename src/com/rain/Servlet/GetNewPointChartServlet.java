package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.PointDao;
import com.rain.dao.PositionDao;
import com.rain.dao.impl.PointDaoimpl;
import com.rain.dao.impl.PositionDaoimpl;
import com.rain.entity.Point;
import com.rain.entity.Position;

/**
 * Servlet implementation class GetNewPointChartServlet
 */
@WebServlet("/GetNewPointChartServlet")
public class GetNewPointChartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetNewPointChartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		PointDao pointdao = new PointDaoimpl();
		String y = (String)request.getParameter("year");
		int year = Integer.valueOf(y);
		String m = (String)request.getParameter("month");
		int month = Integer.valueOf(m);
		List<Point> listChart = pointdao.selectAll(year,month);
		System.out.println(listChart.size());
		if (listChart.size()>0) {
			request.getSession().setAttribute("listChart", listChart);
			request.getSession().setAttribute("year", y);
			request.getSession().setAttribute("month",m);
			response.sendRedirect("ShowDataNew.jsp");
		}
		else
		{
			out.print("<script type='text/javascript'>alert('此月无监测计划');window.location.href='GetNNewPointServlet';</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
