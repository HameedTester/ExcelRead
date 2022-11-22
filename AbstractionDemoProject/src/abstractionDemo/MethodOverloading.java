package abstractionDemo;

public class MethodOverloading {
	
	
	int a=10; // Gloabl Variable
	int b =20;
	
	
	public void addNumbers() // zero parameters
	{
		
		System.out.println("Addition of Two Numbers: "+(a+b)); //10+20
	}
	
	public void addNumbers(int a, int b)//  datatype parameter  // local variable
	{
		
		System.out.println(a-b);
		
	}
	
	public void addNumbers(float a, int b) // changing the data type
	{
		System.out.println(a-b);
		
	}
	
	public void addNumbers(int a, float b) // order of the data type
	{
		
		System.out.println(a-b);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.addNumbers();
		m.addNumbers(30, 20);
		m.addNumbers(23.4f, 34);
		m.addNumbers(30, 50.4f);
	}
	

}
