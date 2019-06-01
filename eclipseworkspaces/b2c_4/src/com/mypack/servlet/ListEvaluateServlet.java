package com.mypack.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mypack.dao.EvaluateDaoIF;
import com.mypack.dao.EvaluateDaoImpl;
import com.mypack.entity.Evaluate;
import com.mypack.entity.Goods;

@WebServlet("/ListEvaluateServlet")
public class ListEvaluateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		//��session������ȥgood����
		Goods good=(Goods) session.getAttribute("good");
		
		//����dao ������Ʒ��Ų�ѯ��������
		EvaluateDaoIF evaDao=new EvaluateDaoImpl();
		List<Evaluate> evaLst=evaDao.queryAllEvaluateByGoodsId(good.getGoodsId());
		
		//����application ServletContext����
		ServletContext application=this.getServletContext();
		application.setAttribute("evaInfo", evaLst);
		
		response.sendRedirect("payfor.jsp");
	}

}
