package ExceptionDemo;

public class Register {
	private static String[] names = {"will","lili","lucy"};
	
	public static void main(String[] args) {
		try {
			checkUername("will");
			System.out.println("ע��ɹ�");
		} catch (LogicException | ArithmeticException e) {
			//getMessage  ��ȡ�������Ϣ
			String err = e.getMessage();
			System.out.println("���û���"+err);
		}
		
		
	}
	public static boolean checkUername(String username) {
			for(String name : names) {
				if(name.equals(username)){
					throw new LogicException("��"+name+"�Ѿ���ע����");
				}
			}
			return true;
	}
}
