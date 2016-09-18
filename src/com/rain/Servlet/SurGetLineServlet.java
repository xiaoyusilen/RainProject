package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.impl.LineDaoimpl;
import com.rain.entity.line;

/**
 * Servlet implementation class SurGetLineServlet
 */
@WebServlet("/SurGetLineServlet")
public class SurGetLineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SurGetLineServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String p = request.getParameter("pno");
		int no = Integer.valueOf(p);
		String type = request.getParameter("type");
		LineDaoimpl linedao = new LineDaoimpl();
		PrintWriter out = response.getWriter();
		List<line> listLine = linedao.selectsurface(no, type);
	    //设置返回时的编码格式
	    response.setContentType("text/html; charset=utf-8");
		ArrayList<Double> time = new ArrayList();
		ArrayList<Double> data = new ArrayList();
	    for(line line1:listLine)
	    {
	    	String yy = line1.getYear();
	    	String mm = line1.getMonth();
	    	int y = Integer.valueOf(yy);
	    	int m = Integer.valueOf(mm);
	    	Double t = y+m*0.01;
	    	time.add(t);
	    	data.add(line1.getData());
	    }
		request.getSession().setAttribute("time", time);
		request.getSession().setAttribute("data", data);
		String s1 ="总磷含量";
		String s2 ="氨氮含量";
		String s3 ="COD含量";
		if(type.equals("rnh"))
		{
			request.getSession().setAttribute("type",s2 );
			String s4 ="第"+no+"位氨氮含量折线图";
			request.getSession().setAttribute("title", s4);
		}
		else if(type.equals("rtp"))
		{
			request.getSession().setAttribute("type",s1 );
			String s4 ="第"+no+"位总磷含量折线图";
			request.getSession().setAttribute("title", s4);
		}
		else if(type.equals("rcod"))
		{
			request.getSession().setAttribute("type",s3 );
			String s4 ="第"+no+"位COD含量折线图";
			request.getSession().setAttribute("title", s4);
		}
		request.getSession().setAttribute("p", no);
		response.sendRedirect("line.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
