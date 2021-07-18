import java.util.Scanner;

public class Sort {
	
	public static void main(String a[]){
		
		int values[];
		values = new int[100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of values in the array");
		int limit = sc.nextInt();
		
		System.out.println("Please enter the values ");
		
		for(int i = 0; i<limit; i++){
			
			values[i] = sc.nextInt();
				
		}
		
		for(int i = 0; i<limit-1; i++){
			
			for(int j = i+1 ; j<limit; j++){
				
				if (values[i] > values[j]) {
					
					int temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted array is given as:");
		
		for(int i = 0; i<limit; i++){
			
			System.out.print(values[i]+" ");
		}
		
		
		
	}

}
