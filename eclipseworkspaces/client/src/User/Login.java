package User;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbc.userDao;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		Writer out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		userDao userdao = new userDao();
		boolean b = userdao.ch_User(username, password);
		if(b){
			
			/*���û���Ϣ����session*/
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			out.write("��ϲ���½�ɹ�3���Ϊ���Զ���ת����ҳ����");
			response.setHeader("Refresh", "3;URL=index.jsp");
		}else{
			out.write("��½ʧ�ܣ�3���Ϊ����ת��ע�����");
			response.setHeader("Refresh", "3;URL=register.jsp");
		}
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
