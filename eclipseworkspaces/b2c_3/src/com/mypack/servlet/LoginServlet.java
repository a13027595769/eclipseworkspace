package com.mypack.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mypack.dao.UserDaoIF;
import com.mypack.dao.UserDaoImpl;
import com.mypack.entity.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
    	String username=request.getParameter("username");
    	String password=request.getParameter("password");
    	
    	User user=new User(username,password);//�û���¼ʱ��user����
    	
    	//�������ݿ�����û�����ѯ���ݿ�user���� ��ѯ����
    	UserDaoIF userDao=new UserDaoImpl();
    	User u=userDao.queryUserByUsername(user);//u ��ʾ���ݿ��ѯ����user����
    	String msg="";
    	if(u!=null){
    		//�û�������
    		
    		if(user.getPassword().equals(u.getPassword())){
    			msg="��¼�ɹ�";
    			String name=user.getUsername();//ʵ�ʵ��û���
    			HttpSession session=request.getSession();
    			session.setAttribute("name",name);
    			RequestDispatcher rd=request.getRequestDispatcher("ListGoodsServlet");
    			rd.forward(request, response);
    			return ;
    			
    		}else{
    			msg="�������";
    			
    		}
    	}else{
    		msg="�û��������ڣ����������롣����";
    		
    	}
    	request.setAttribute("msg", msg);
    	RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
    	rd.forward(request, response);
	}

}
