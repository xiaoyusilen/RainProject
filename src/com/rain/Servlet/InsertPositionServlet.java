package com.rain.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.PositionDao;
import com.rain.dao.impl.PositionDaoimpl;
import com.rain.entity.Position;

/**
 * Servlet implementation class InsertPositionServlet
 */
@WebServlet("/InsertPositionServlet")
public class InsertPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPositionServlet() {
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
		String p = (String)request.getParameter("pno");
		int pno = Integer.valueOf(p);
		String year = (String)request.getParameter("year");
		String month = (String)request.getParameter("month");
		String p1 = (String)request.getParameter("ppv");
		Double ppv = Double.valueOf(p1);
		String p2 = (String)request.getParameter("pnv");
		Double pnv = Double.valueOf(p2);
		String p3 = (String)request.getParameter("pcod");
		Double pcod = Double.valueOf(p3);
		String p4 = (String)request.getParameter("pcom");
		System.out.println(p4);
		Double pcom = Double.valueOf(p4);
		Position position = new Position(pno,ppv,pnv,pcod,pcom,month,year);
		PositionDao positiondao = new PositionDaoimpl();
		int affectrow = positiondao.insert(position);
		if(affectrow>0)
		{
			request.getSession().setAttribute("year", year);
			request.getSession().setAttribute("month", month);
			response.sendRedirect("QueryBackServlet");
		}
		else
		{
			response.sendRedirect("GetNewChartServlet");
		}
		
	}

}