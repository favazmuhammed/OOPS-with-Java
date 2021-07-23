
public class Hello {
	
	public static void main(String[] args) {
		
		
		
		ThreadSample st1=new ThreadSample(1);
		ThreadSample st2=new ThreadSample(2);
		ThreadSample st3=new ThreadSample(3);
		
		Thread t1=new Thread(st1);
		Thread t2=new Thread(st2);
		Thread t3=new Thread(st3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
