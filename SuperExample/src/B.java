
public class B extends A {
	
	int a;
	
	void display() {
		
		System.out.println("its sub class B");

		
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
