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
import com.rain.dao.impl.PointDaoimpl;
import com.rain.entity.Point;

/**
 * Servlet implementation class GetPointServlet
 */
@WebServlet("/GetPointServlet")
public class GetPointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPointServlet() {
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
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8"); 
		String y = request.getParameter("year");
		int year = Integer.valueOf(y);
		String m = request.getParameter("month");
		int month = Integer.valueOf(m);
		PointDao pointdao = new PointDaoimpl();
		List<Point> listPoint = pointdao.selectAll(year,month);
		if (listPoint.size()>0) {
			request.getSession().setAttribute("listPoint", listPoint);
			response.sendRedirect("surfacewater.jsp");
		}
		else
		{
			response.sendRedirect("GetNewPointServlet");
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
