package �߳�1;

public class Productor implements Runnable{
	private ShareResource resource = null;

	
	
	public Productor(ShareResource resource) {
		this.resource = resource;
	}



	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			if(i%2==0) {
				resource.push("����", "��");
			}else {
				resource.push("���", "Ů");
			}
		}
	}
	
	
}
