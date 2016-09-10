package com.rain.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rain.dao.UserDao;
import com.rain.dao.impl.UserDaoimpl;
import com.rain.entity.User;

/**
 * Servlet implementation class ModifyServlet
 */
@WebServlet("/ModifyServlet")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyServlet() {
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
		String oldpass = (String)request.getParameter("oldpass");
		String pass = (String)request.getParameter("pass");
		User user = new User("admin",oldpass);
		UserDaoimpl userdao = new UserDaoimpl();
		boolean flag = userdao.LoginValidate(user);
		if(flag){
			int affectrow = userdao.modify(pass, oldpass);
			if(affectrow>0){
				out.print("<script>alert('修改成功，请重新登陆');top.location.href=('cancel.jsp');</script>");
			}
			else{
				out.print("<script>alert('修改失败');window.location.href=('modify.jsp');</script>");
			}
		}
		else{
			out.print("<script>alert('原始密码输入错误！');window.location.href=('modify.jsp');</script>");
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
