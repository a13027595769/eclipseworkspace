package com.parameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/param/list")
public class ListServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;
	//输出收件箱界面
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		
		String username = req.getParameter("username");
		out.println("欢迎:"+username+"<br/>");
		
		for (int i = 1; i < 6; i++) {
			out.println("<a href='/param/get?username="+username+"'>收件箱</a><br/>");
		}
		
		
	}
}
