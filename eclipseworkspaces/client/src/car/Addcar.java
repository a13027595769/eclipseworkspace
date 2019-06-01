package car;

import java.io.IOException;
import java.util.HashMap;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Addcar extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String book_id = request.getParameter("book_id");	//�����ѡ�鼮ID
		String numberString = request.getParameter("number"); 	//��ȡ��ѡ�鼮������
		int book_number = Integer.parseInt(numberString); //������תΪ��ֵ���ͣ�
		HttpSession session = request.getSession();
		book new_book = (book)session.getAttribute(book_id);//��ȡ������ҳ��ʱ�洢��session�е�book����
		new_book.setBook_number(book_number);	//����ѡ�鼮���������鼮����
		
		Map map_car = (Map)session.getAttribute("map_car");
		if(map_car == null) {			//������������ﳵ�����򴴽����ﳵMap����
			map_car = new HashMap();
			map_car.put(book_id, new_book);//���鼮������빺�ﳵ����Ӧ��Ϊ���鼮id��
			session.setAttribute("map_car", map_car);//�����ﳵ����session;
			//�ض��򵽹��ﳵjsp
			response.sendRedirect("car.jsp");
		}else {
		/**********���ﳵ����start********/
			
			if(map_car.containsKey(book_id)) {	//�жϹ��ﳵ�Ƿ��Ѵ��ڸö��������ڣ��¾��鼮������ѡ����������빺�ﳵ��
				book old_book = (book)map_car.get(book_id);
				int n = old_book.getBook_Number() + new_book.getBook_Number();
				old_book.setBook_number(n);
				//�ض��򵽹��ﳵjsp
				response.sendRedirect("car.jsp");	
			}else {
				map_car.put(book_id, new_book);//���鼮������빺�ﳵ����Ӧ��Ϊ���鼮id��
				session.setAttribute("map_car", map_car);//�����ﳵ����session;
				//�ض��򵽹��ﳵjsp
				response.sendRedirect("car.jsp");
				
			}		
			
			
		/**********���ﳵ����end********/
		}
		
	
		
		
		
		/*************************�������ݿ����鼮��Ϣstart****************************/
		
		
		/*************************�������ݿ����鼮��Ϣend*****************************/
		
		/************************���鼮��ӵ����ﳵstart********************************/
		
		/************************���鼮��ӵ����ﳵend**********************************/
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
