package com.mypack.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypack.dao.CartDaoIF;
import com.mypack.dao.CartDaoImpl;

@WebServlet("/DeleteCartServlet")
public class DeleteCartServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//ȡ����goodsId
		String ids=request.getParameter("goodsId");
		int goodsId=Integer.parseInt(ids);
		
		//����dao  ɾ��
		CartDaoIF cartDao=new CartDaoImpl();
		cartDao.deleteCartById(goodsId);
		
		response.sendRedirect("ListCartServlet");
	}

}
