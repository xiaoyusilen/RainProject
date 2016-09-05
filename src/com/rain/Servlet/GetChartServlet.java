package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.PositionDao;
import com.rain.dao.impl.PositionDaoimpl;
import com.rain.entity.Position;
import com.rain.entity.Time;

/**
 * Servlet implementation class GetChartServlet
 */
@WebServlet("/GetChartServlet")
public class GetChartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetChartServlet() {
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
		PositionDao positiondao = new PositionDaoimpl();
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		List<Position> listChart = positiondao.selectAll(month, year);
		if (listChart.size()>0) {
			request.getSession().setAttribute("listChart", listChart);
			request.getSession().setAttribute("year", year);
			request.getSession().setAttribute("month",month);
			response.sendRedirect("ShowData.jsp");
		}
		else
		{
			out.print("<script type='text/javascript'>alert('No Data!');window.location.href='GetNewChartServlet';</script>");
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
