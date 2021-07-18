
public class Hello {
	
	public static void main(String ar[]) {
		
		Sample s1=new Sample();  //creating an object in class Sample
		Sample s2=new Sample();
		
		s1.a = 20;
		s1.b = 40;
		s2.a = 50;
		s2.b = 100;
		
		System.out.println("s1-a: "+s1.a+"  s2-b: "+s2.b);
	}

}
