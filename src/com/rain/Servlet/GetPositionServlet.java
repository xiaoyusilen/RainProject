package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.PositionDao;
import com.rain.dao.impl.PositionDaoimpl;
import com.rain.entity.Position;

/**
 * Servlet implementation class GetPositionServlet
 */
public class GetPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPositionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		PrintWriter out = response.getWriter();
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8"); 
		if(request.getParameter("pno")!=null)
		{
			int pno = Integer.valueOf(request.getParameter("pno"));
			String y = request.getParameter("year");
			int year = Integer.valueOf(y);
			String m = request.getParameter("month");
			int month = Integer.valueOf(m);
			PositionDao positiondao = new PositionDaoimpl();
			Position position = positiondao.query(pno);
			List<Position> listPosition = positiondao.selectAll(month, year);
			request.getSession().setAttribute("pno", pno);
			request.getSession().setAttribute("px",position.getPx());
			request.getSession().setAttribute("py",position.getPy());
			request.getSession().setAttribute("listPosition", listPosition);
			response.sendRedirect("image2.jsp");
		}
		else
		{
			String y = request.getParameter("year");
			int year = Integer.valueOf(y);
			String m = request.getParameter("month");
			int month = Integer.valueOf(m);
			PositionDao positiondao = new PositionDaoimpl();
			List<Position> listPosition = positiondao.selectAll(month,year);
			if (listPosition.size()>0) {
				request.getSession().setAttribute("listPosition", listPosition);
				response.sendRedirect("image.jsp");
			}
			else
			{
				out.print("<script language='javascript'>alert('No Data!');window.location.href='GetNewPositionServlet';</script>");
			}
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
