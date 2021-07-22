
public class Sample implements Hello {
	
	public void display(String text) {
		
		System.out.println(text);
			
	}
	
	Sample(){
		
		TextScanner sc=new TextScanner(this);
		sc.scan();
	}
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
	}

}
