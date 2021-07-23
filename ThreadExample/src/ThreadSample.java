
public class ThreadSample extends Thread {
	
	
	int a;
	ThreadSample(int a){
		
		this.a = a;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Count "+i+ " thread "+a );
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

//place thread in try catch because of possible exception 