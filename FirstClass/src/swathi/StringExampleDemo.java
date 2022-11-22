package swathi;

public class StringExampleDemo {
	
	String s = "India is the best country.";
	
	
	public void stringProgram()
	{
		
		
		for(int i=s.length()-1;i>=0;i--) //22 23>=0
		{
			
			System.out.print(s.charAt(i));
		}
		
	}
	public static void main(String[] args) {
		
		StringExampleDemo s = new StringExampleDemo();
		s.stringProgram();
	}
}
