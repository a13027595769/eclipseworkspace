package �߳����ȼ�;

public class Priority extends Thread{
		@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println(this.getName()+"    "+i);
			}
		}
}
