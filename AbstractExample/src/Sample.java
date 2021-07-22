
public class Sample extends Hello {
	
	void onText(String text) {
		
		System.out.println(text);
	}
	
	Sample(){
		
		TextScanner ts=new TextScanner(this); //pass current object
		ts.scan();
	}
	
	public static void main(String[] args) {
		
		Sample s=new Sample();
		
	}

}
