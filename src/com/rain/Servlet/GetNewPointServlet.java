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
import com.rain.entity.Time;

/**
 * Servlet implementation class GetNewPointServlet
 */
@WebServlet("/GetNewPointServlet")
public class GetNewPointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetNewPointServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		PointDao pointdao = new PointDaoimpl();
		Time time =pointdao.querytime();
		int year = Integer.valueOf(time.getYear());
		int month = Integer.valueOf(time.getMonth());
		System.out.println(year);
		System.out.println(month);
		List<Point> listPoint = pointdao.selectAll(year,month);
		if (listPoint != null) {
			request.getSession().setAttribute("listPoint", listPoint);
			response.sendRedirect("surfacewater.jsp");
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
