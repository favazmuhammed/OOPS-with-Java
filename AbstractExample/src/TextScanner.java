
public class TextScanner {
	
	Hello obj;
	
	public TextScanner(Hello obj) {
		
		this.obj = obj;	
	}
	
	void scan() {
		
		
		//after more operations a text will get
		
		String text = "Scanned text";
		
		obj.onText(text);
	}

}
