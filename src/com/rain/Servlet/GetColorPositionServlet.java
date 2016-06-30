package com.rain.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.PositionDao;
import com.rain.dao.impl.PositionDaoimpl;
import com.rain.entity.Position;

/**
 * Servlet implementation class GetColorPositionServlet
 */
@WebServlet("/GetColorPositionServlet")
public class GetColorPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetColorPositionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int pno = Integer.valueOf(request.getParameter("pno"));
		String y = request.getParameter("year");
		int year = Integer.valueOf(y);
		String m = request.getParameter("month");
		int month = Integer.valueOf(m);
		System.out.println(year);
		PositionDao positiondao = new PositionDaoimpl();
		Position position = positiondao.query(pno);
		List<Position> listPosition = positiondao.selectAll(month, year);
		request.getSession().setAttribute("pno", pno);
		request.getSession().setAttribute("px",position.getPx());
		request.getSession().setAttribute("py",position.getPy());
		request.getSession().setAttribute("listPosition", listPosition);
		request.getSession().setAttribute("year", year);
		request.getSession().setAttribute("month", month);
		response.sendRedirect("image2.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
