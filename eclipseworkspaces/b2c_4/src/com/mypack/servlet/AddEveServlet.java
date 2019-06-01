package com.mypack.servlet;

import java.io.IOException;
import java.util.Date;

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
import com.mypack.util.DateUtil;

@WebServlet("/AddEveServlet")
public class AddEveServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����post��������
		request.setCharacterEncoding("utf-8");
		//ȡ�����Ǽ� int 
		String grade=request.getParameter("grade");
		int score=Integer.parseInt(grade);
		
		//ȡ��������
		String content=request.getParameter("content");
		
		//ȡ�����۵���Ʒ���
		String ids=request.getParameter("goodsId");
		int goodsId=Integer.parseInt(ids);
		
		//��goodsIdͨ��Goods������Я��
		Goods good=new Goods();
		good.setGoodsId(goodsId);;
		
		//��ȡ������ ��ǰ��¼�û�
		HttpSession session=request.getSession();
		String evaName=(String) session.getAttribute("name");
		
		//��ȡϵͳ��ǰʱ��
		String evaDate=DateUtil.dateToString(new Date());
		
		//��װ��Evaluate�������� 
		Evaluate eva=new Evaluate(evaName, content, score, evaDate, good);
		
		//����dao��ӵ��߼�
		EvaluateDaoIF evaDao=new EvaluateDaoImpl();
		evaDao.addEvaluate(eva);
		
		response.sendRedirect("ListEvaluateServlet");
		
		
	}

}
