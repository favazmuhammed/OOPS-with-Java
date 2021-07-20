
public class B extends A {
	
	int a;
	
	B(){
		
		super(10);
		System.out.println("its B constructor");
	}
	
	B(int a){
		
		System.out.println("its argument constructor of B");
	}
	
	
	
	public static void main(String[] args) {
		
		B b=new B();
		
	}
}
