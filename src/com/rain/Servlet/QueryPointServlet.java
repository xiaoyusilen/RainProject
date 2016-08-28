package com.rain.Servlet;

import java.io.IOException;
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
 * Servlet implementation class QueryPointServlet
 */
@WebServlet("/QueryPointServlet")
public class QueryPointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryPointServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String pno = (String) request.getParameter("pno");
		String month = (String) request.getParameter("month");
		String year = (String) request.getParameter("year");
		PointDao pointdao = new PointDaoimpl();
		Point point = pointdao.querybyid(pno, year, month);
		if(point!=null)
		{
			request.getSession().setAttribute("point",point);
			request.getSession().setAttribute("month", month);
			request.getSession().setAttribute("year", year);
			request.getSession().setAttribute("pno", pno);
			response.sendRedirect("updatenewData.jsp");
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
