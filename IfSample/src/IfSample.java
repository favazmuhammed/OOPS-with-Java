import java.util.Scanner;

public class IfSample {
	
	public static void main(String ar[]) {
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
	//	if (num<0) {
	//		System.out.println("Number is negative");
	//	}else {
	//		System.out.println("Number is positive");
	//	}
		
		int sum =0;
		
		for(int i=0; i <= num; i++) {
			
			sum = sum + i;
		}
		
		System.out.println("Sum of first "+num+" nutural numbers is equel to "+sum);
		
	}

}
