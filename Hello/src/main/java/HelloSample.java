import java.util.Scanner;

public class HelloSample {
	
	public static void main(String ar[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two values");
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		int c = a + b;
		System.out.println("Result:"+c);
	}

}
