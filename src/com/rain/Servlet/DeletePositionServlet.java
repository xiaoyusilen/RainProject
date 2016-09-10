package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.PositionDao;
import com.rain.dao.impl.PositionDaoimpl;

/**
 * Servlet implementation class DeletePositionServlet
 */
@WebServlet("/DeletePositionServlet")
public class DeletePositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePositionServlet() {
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
		System.out.println(pno+year+month);
		PositionDao positiondao = new PositionDaoimpl();
		int affectRow = positiondao.delete(pno, year, month);
		if(affectRow!=-1){
			request.getSession().setAttribute("year", year);
			request.getSession().setAttribute("month", month);
			out.print("<script>alert('删除成功');window.location.href=('QueryBackServlet');</script>");
		}
		
		//response.sendRedirect("QueryBackServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
