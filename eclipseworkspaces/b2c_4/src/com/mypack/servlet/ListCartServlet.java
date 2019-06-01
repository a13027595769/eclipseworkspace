package com.mypack.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mypack.dao.CartDaoIF;
import com.mypack.dao.CartDaoImpl;
import com.mypack.entity.Goods;
import com.mypack.entity.Item;
import com.mypack.entity.User;

@WebServlet("/ListCartServlet")
public class ListCartServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ѯĳ�û��µĹ��ﳵ�����е���Ŀ��Ϣ �����û�����
		HttpSession session=request.getSession();
		String name=(String)session.getAttribute("name");
		User user=new User();
		user.setUsername(name);
		
		//����dao ��ѯ����
		CartDaoIF cartDao=new CartDaoImpl();
		//���ݿ��ѯδ�ϲ� ��Ʒ�ظ�
		List<Item> cartLst=cartDao.queryAllCart(user);
		
		session.setAttribute("cartInfo",cartLst);
		//��ת�����ﳵ
		response.sendRedirect("dingdan.jsp");
		
	}
	
	
}
