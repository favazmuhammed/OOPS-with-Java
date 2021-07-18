
public class Hello {
	
	public static void main(String ar[]) {
		
		Sample s1=new Sample();  //creating an object in class Sample
		Sample s2=new Sample();
		
		s1.a = 10;
		s1.b = 20;
		s2.a = 50;
		s2.b = 100;
		
		s1.display();
		s2.display();
	}

}
