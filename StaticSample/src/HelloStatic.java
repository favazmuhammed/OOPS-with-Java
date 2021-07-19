
public class HelloStatic {
	
 
	int a=10;
	static int b = 10;
	public static void main(String ar[]) {
		
		HelloStatic h=new HelloStatic();
		HelloStatic h1=new HelloStatic();
		System.out.println(h.a);
		h.hello();
		hey();
		
		h.b= 50;
		h1.b= 100;
		
		System.out.println("h-b: "+h.b);
		System.out.println("h1-b: "+h1.b);
	}
	
	
	void hello() {
	
	
	}
	
	static void hey() {
		
		
	}
	
	
	}


