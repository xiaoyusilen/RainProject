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
 * Servlet implementation class UpdatePointServlet
 */
@WebServlet("/UpdatePointServlet")
public class UpdatePointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePointServlet() {
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
		String year = (String)request.getSession().getAttribute("year");
		String month = (String)request.getSession().getAttribute("month");
		String pno = (String)request.getSession().getAttribute("pno");
		String rph = (String)request.getParameter("rph");
		String rnh = (String)request.getParameter("rnh");
		String rkm = (String)request.getParameter("rkm");
		String rcod = (String)request.getParameter("rcod");
		String rdo = (String)request.getParameter("rdo");
		String rbod = (String)request.getParameter("rbod");
		String rwt = (String)request.getParameter("rwt");
		String rxf = (String)request.getParameter("rxf");
		String ryls = (String)request.getParameter("ryls");
		String rtn = (String)request.getParameter("rtn");
		String rtp = (String)request.getParameter("rtp");
		PointDao pointdao = new PointDaoimpl();
		int affectrow = pointdao.update(pno, rph, rnh, rkm, rcod, rdo, rbod, rwt, rxf, ryls, rtp, rtn, year, month);
		if(affectrow>0)
		{
			request.getSession().setAttribute("year", year);
			request.getSession().setAttribute("month", month);
			out.print("<script>alert('修改成功');window.location.href=('QueryBackPointNewServlet');</script>");
		}
		else{
			out.print("<script>alert('修改失败');window.location.href=('GetNNewPointServlet');</script>");
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
