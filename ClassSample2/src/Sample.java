
public class Sample {
	
	public static void main(String ar[]){
		
		int num1=100;
		int num2=200;
		int num3 =300;
		
		
		Sum s=new Sum();
		Sum s1=new Sum();
		
		s.calculatesum(num1, num2);
		s.displaysum();
		
		s1.calculatesum(num2, num3);
		s1.displaysum();
		
		s.displaysum();
		
	}

}
