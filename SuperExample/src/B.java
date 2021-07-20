
public class B extends A {
	
	int a;
	
	void display() {
		
		System.out.println("its sub class B");
		
		a = 20;
		super.a = 30;
		int c = a + super.a;
		
		System.out.println("Sum = "+c);
	
		
	}
	
	void displaynew() {
		
		super.display();
	}

	
	public static void main(String[] args) {
		
		B b=new B();
		b.display();
		b.displaynew();
		
	}
}
