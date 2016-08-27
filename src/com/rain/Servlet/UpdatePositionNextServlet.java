package com.rain.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rain.dao.PositionDao;
import com.rain.dao.impl.PositionDaoimpl;

/**
 * Servlet implementation class UpdatePositionNextServlet
 */
@WebServlet("/UpdatePositionNextServlet")
public class UpdatePositionNextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePositionNextServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		String year = (String)request.getSession().getAttribute("year");
		String month = (String)request.getSession().getAttribute("month");
		String pno = (String)request.getSession().getAttribute("pno");
		String ppv = (String)request.getParameter("ppv");
		String pnv = (String)request.getParameter("pnv");
		String pcod = (String)request.getParameter("pcod");
		String pcom = (String)request.getParameter("pcom");
		PositionDao positiondao = new PositionDaoimpl();
		int rs = positiondao.update(pno, ppv, pnv, pcod, pcom, year, month);
		if(rs>0)
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
