import java.util.Scanner;

public class ArraySample {
	
	public static void main(String a[]) {
		
		int my_array[][];
		my_array = new int[3][3];
		
		System.out.println("Enter values in the matrix");
		Scanner sc=new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				my_array[i][j] = sc.nextInt();
					
			}
		}
		
		System.out.println("The array is as follow");
		
		for (int i=0; i<3; i++) {
	
			System.out.println("");
			
			for(int j=0; j<3; j++) {
				
				System.out.print(my_array[i][j]+" ");
	}
}

}
}
