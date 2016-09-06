package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.PointDao;
import com.rain.dao.PositionDao;
import com.rain.dao.impl.PointDaoimpl;
import com.rain.dao.impl.PositionDaoimpl;

/**
 * Servlet implementation class DeletePointServlet
 */
@WebServlet("/DeletePointServlet")
public class DeletePointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePointServlet() {
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
		String pno = (String)request.getParameter("pno");
		String year = (String)request.getParameter("year");
		String month = (String)request.getParameter("month");
		PointDao pointdao = new PointDaoimpl();
		pointdao.delete(pno, year, month);
		request.getSession().setAttribute("year", year);
		request.getSession().setAttribute("month", month);
		//out.print("<script>alert('删除成功');location.href('QueryBackPointNewServlet');</script>");
		response.sendRedirect("QueryBackPointNewServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
