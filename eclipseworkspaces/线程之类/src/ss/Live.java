package ss;

public class Live {
	private static boolean alive = true;
	public static void main(String[] args) {
		while(alive) {
			eat();
			sleep();
			code();
			repeat();
		}
		
	}
	public static void eat() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�Է���");
	}
	public static void sleep() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("˯����");
	}
	public static void code() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ô���");
	}
	public static void repeat() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eat();
		sleep();
		code();
		repeat();
	}

}
