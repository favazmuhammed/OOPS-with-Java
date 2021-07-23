
public class Hello {
	
	public static void main(String[] args) {
		
		ThreadSample st1=new ThreadSample(1);
		ThreadSample st2=new ThreadSample(2);
		ThreadSample st3=new ThreadSample(3);
		
		st1.start();
		st2.start();
		st3.start();
		
		
	}

}
