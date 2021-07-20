
public class B extends A {
	
	int a;
	
	B(){
		
		System.out.println("its B constructor");
	}
	
	B(int b){
		
		System.out.println("its argument constructor of A");
	}
	
	void display() {
		
		System.out.println("its sub class B");
		
		
	}
	

	
	public static void main(String[] args) {
		
		B b=new B();
		
	}
}
