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

import com.rain.dao.PositionDao;
import com.rain.dao.impl.PositionDaoimpl;
import com.rain.entity.Position;

/**
 * Servlet implementation class QueryServlet
 */
@WebServlet("/QueryServlet")
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String a = request.getParameter("year");
		String b = request.getParameter("month");
		String c = request.getParameter("type");
		HttpSession session=request.getSession();
		session.setAttribute("type",c);
		String d = request.getParameter("way");
		String e = request.getParameter("view");
		PrintWriter out = response.getWriter();
		
		int year = Integer.valueOf(a);
		int month = Integer.valueOf(b);
		Double view = Double.valueOf(e);
		
		PositionDao positiondao = new PositionDaoimpl();
		List<Position> listPosition = positiondao.query(year,month,c,d,view);
		
		if (listPosition != null) {
			request.getSession().setAttribute("listPosition", listPosition);
			session.setAttribute("size",listPosition.size());
			response.sendRedirect("ShowQuery.jsp");
		}
		
	}

}
