package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.PointDao;
import com.rain.dao.impl.PointDaoimpl;
import com.rain.entity.Point;

/**
 * Servlet implementation class InsertPointServlet
 */
@WebServlet("/InsertPointServlet")
public class InsertPointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPointServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();
		String p = (String)request.getParameter("pno");
		int pno = Integer.valueOf(p);
		String r1 = (String)request.getParameter("rph");
		Double rph,rnh,rkm,rcod,rdo,rbod,rwt,ryls,rtn,rtp,rxf;
		if(r1 == null || r1.length() <= 0)
		{
			rph = 0.0;
		}
		else
			rph = Double.valueOf(r1);
		String r2 = (String)request.getParameter("rnh");
		if(r2 == null || r2.length() <= 0)
		{
			rnh = 0.0;
		}
		else
			rnh = Double.valueOf(r2);
		String r3 = (String)request.getParameter("rkm");
		if(r3 == null || r3.length() <= 0)
		{
			rkm = 0.0;
		}
		else
			rkm = Double.valueOf(r3);
		String r4 = (String)request.getParameter("rcod");
		if(r4 == null || r4.length() <= 0)
		{
			rcod = 0.0;
		}
		else
			rcod = Double.valueOf(r4);
		String r5 = (String)request.getParameter("rdo");
		if(r5 == null || r5.length() <= 0)
		{
			rdo = 0.0;
		}
		else
			rdo = Double.valueOf(r5);
		String r6 = (String)request.getParameter("rbod");
		if(r6 == null || r6.length() <= 0)
		{
			rbod = 0.0;
		}
		else
			rbod = Double.valueOf(r6);
		String r7 = (String)request.getParameter("rwt");
		if(r7 == null || r7.length() <= 0)
		{
			rwt = 0.0;
		}
		else
			rwt = Double.valueOf(r7);
		String r8 = (String)request.getParameter("ryls");
		if(r8 == null || r8.length() <= 0)
		{
			ryls = 0.0;
		}
		else
			ryls = Double.valueOf(r8);
		String r9 = (String)request.getParameter("rtn");
		if(r9 == null || r9.length() <= 0)
		{
			rtn = 0.0;
		}
		else
			rtn = Double.valueOf(r9);
		String r10 = (String)request.getParameter("rtp");
		if(r10 == null || r10.length() <= 0)
		{
			rtp = 0.0;
		}
		else
			rtp = Double.valueOf(r10);
		String y = (String)request.getParameter("year");
		int year = Integer.valueOf(y);
		String m = (String)request.getParameter("month");
		int month = Integer.valueOf(m);
		String r11 = (String)request.getParameter("rxf");
		if(r11 == null || r11.length() <= 0)
		{
			rxf = 0.0;
		}
		else
			rxf = Double.valueOf(r11);
		Point point = new Point(pno,rph,rnh,rkm,rcod,rdo,rbod,rwt,rxf,ryls,rtn,rtp,year,month);
		PointDao pointdao = new PointDaoimpl();
		int po = pointdao.querybyId(p, y, m);
		if(po==1){
			out.print("<script>alert('该点已存在');window.location.href=('InsertPoint.jsp');</script>");
		}
		else{
			int affectrow = pointdao.insert(point);
			if(affectrow>0)
			{
				request.getSession().setAttribute("year", y);
				request.getSession().setAttribute("month", m);
				out.print("<script>alert('添加成功');window.location.href=('QueryBackPointNewServlet');</script>");
				//response.sendRedirect("QueryBackPointNewServlet");
			}
		}
		
	}

}
