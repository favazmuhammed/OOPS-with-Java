
public class HelloStatic {
	
 
	int a=10;
	static int b = 10;
	public static void main(String ar[]) {
		
		HelloStatic h=new HelloStatic();
		HelloStatic h1=new HelloStatic();
		System.out.println(h.a);
		h.hello();
		hey();
		
		h.a = 200;
		h1.a= 400;
		h.b= 50;
		h1.b= 100;
		
		System.out.println("h-b: "+h.b);
		System.out.println("h1-b: "+h1.b);
		System.out.println("h-a: "+h.a);
		System.out.println("h1-a: "+h1.a);
	}
	
	
	void hello() {
	
	
	}
	
	static void hey() {
		
		
	}
	
	
	}


