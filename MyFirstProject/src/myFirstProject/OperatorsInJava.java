package myFirstProject;

public class OperatorsInJava {
	
	
	// variable declaration
	int a = 10;
	int b =20;
	
	
	//method
	
	public void addNumbers()
	{
	
		// to print--> system.out.println 
		
		System.out.println("Addition of Two Numbers:"+(a+b)); //10 + 20-->30
		
	}
	
	public void subNumbers()
	{
		
		System.out.println("Subraction of Two Numbers:"+(a-b));// 10-20-->
		
	}
	
	public void mulNumbers()
	
	{
		
		System.out.println("Multiplication of Two Numbers:"+(a*b));
	}
	
	
	public void divNumbers()
	
	
	
	{
		
		System.out.println("Division of Two Numbers:"+(a/b));
	}
	
	public void modNumbers()
	{
		
		System.out.println("Mod of Two Numbers:"+(a%b));
	}
	
	
	//main method
	
	public static void main(String[] args)
	{
		
		//object creation
		
		OperatorsInJava o = new OperatorsInJava();
		o.addNumbers();
		o.subNumbers();
		
		o.mulNumbers();
		o.divNumbers();
		o.modNumbers();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
