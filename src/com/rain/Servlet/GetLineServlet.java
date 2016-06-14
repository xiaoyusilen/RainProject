package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.LineDao;
import com.rain.dao.impl.LineDaoimpl;
import com.rain.entity.line;

import net.sf.json.JSONArray;

import org.jfree.chart.ChartFactory;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.axis.CategoryAxis;  
import org.jfree.chart.axis.NumberAxis;  
import org.jfree.chart.axis.ValueAxis;  
import org.jfree.chart.plot.CategoryPlot;  
import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.chart.servlet.ServletUtilities;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Servlet implementation class GetLineServlet
 */
public class GetLineServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetLineServlet() {
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
		//doGet(request, response);
		LineDaoimpl linedao = new LineDaoimpl();
		List<line> listLine = linedao.selectAll();
	    //设置返回时的编码格式
	    response.setContentType("text/html; charset=utf-8");
	    //调用JSONArray.fromObject方法把array中的对象转化为JSON格式的数组
	    JSONArray array = JSONArray.fromObject(listLine);
	    //System.out.println(array.toString());
	    //返回给前端页面
	    PrintWriter out = response.getWriter();  
	    out.println(array);  
	    out.flush();  
	    out.close(); 
	}

}