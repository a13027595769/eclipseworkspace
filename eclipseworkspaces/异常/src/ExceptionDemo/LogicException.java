package ExceptionDemo;

public class LogicException extends RuntimeException{
	private static final long ID = 1l;

	public LogicException() {
		super();
	}
	/**
	 * 
	 * 
	 * @param message  ��ʾ��ǰ�쳣��ԭ��/��Ϣ
	 * @param cause		��ǰ�쳣�ĸ���ԭ��
	 */
	public LogicException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LogicException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
