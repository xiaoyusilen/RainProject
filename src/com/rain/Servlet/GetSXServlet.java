package com.rain.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.LineDao;
import com.rain.dao.impl.LineDaoimpl;
import com.rain.entity.Position;
import com.rain.entity.line;

/**
 * Servlet implementation class GetSXServlet
 */
@WebServlet("/GetSXServlet")
public class GetSXServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetSXServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String year=request.getParameter("year");
		String month=request.getParameter("month");
		String type=request.getParameter("type");
		String t=request.getParameter("t");
		LineDao linedao = new LineDaoimpl();
		ArrayList<Integer> Position = linedao.selectSX(t);
		List<line> LineList = new ArrayList<line>();
		for(int i=0;i<Position.size();i++)
		{
			line line1 = linedao.select(type, year, month, Position.get(i));
			if(line1!=null)
				LineList.add(line1);
		}
		System.out.println(LineList.size());
		if(LineList.size()!=0)
		{
		ArrayList<Double> sxdata = new ArrayList();
	    for(line line1:LineList)
	    {
	    	sxdata.add(line1.getData());
	    }
		request.getSession().setAttribute("Position",Position);
		request.getSession().setAttribute("year", year);
		request.getSession().setAttribute("month", month);
		request.getSession().setAttribute("sxdata",sxdata);
		String s1 ="总磷含量";
		String s2 ="氨氮含量";
		String s3 ="COD含量";
		if(type.equals("pnv"))
		{
			request.getSession().setAttribute("type",s2 );
			String s4 = year+"年"+month+"月氨氮含量折线图";
			request.getSession().setAttribute("title", s4);
		}
		else if(type.equals("ppv"))
		{
			request.getSession().setAttribute("type",s1 );
			String s4 = year+"年"+month+"月总磷含量折线图";
			request.getSession().setAttribute("title", s4);
		}
		else if(type.equals("pcod"))
		{
			request.getSession().setAttribute("type",s3 );
			String s4 = year+"年"+month+"月COD含量折线图";
			request.getSession().setAttribute("title", s4);
		}
		response.sendRedirect("imagesx.jsp");
		}
		else
		{
			request.getSession().setAttribute("success", 1);
			response.sendRedirect("choose.jsp");
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
