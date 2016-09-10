package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rain.dao.PointDao;
import com.rain.dao.PositionDao;
import com.rain.dao.impl.PointDaoimpl;
import com.rain.dao.impl.PositionDaoimpl;
import com.rain.entity.Point;
import com.rain.entity.Position;

/**
 * Servlet implementation class QueryBackPointNewServlet
 */
@WebServlet("/QueryBackPointNewServlet")
public class QueryBackPointNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryBackPointNewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		PointDao pointdao = new PointDaoimpl();
		HttpSession session = request.getSession(); 
		String y = (String) session.getAttribute("year");
		String m = (String) session.getAttribute("month");
		int year = Integer.valueOf(y);
		int month = Integer.valueOf(m);
		List<Point> listChart = pointdao.selectAll(year, month);
		if(listChart.size()>0)
		{
			request.getSession().setAttribute("listChart", listChart);
			request.getSession().setAttribute("year", year);
			request.getSession().setAttribute("month",month);
			response.sendRedirect("showdd.jsp");
		}
		else{
			response.sendRedirect("GetNNewPointServlet");
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
