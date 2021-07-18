import java.util.Scanner;

public class FunctionSample {
	
	public static void main(String a[]) {
		
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = sum(num1, num2);
		System.out.println("Sum of two numbers:"+result);
		
	
	}
	
	
	static int sum(int a, int b) {
		
		int s = a + b;
		return s;
		
	}

}
