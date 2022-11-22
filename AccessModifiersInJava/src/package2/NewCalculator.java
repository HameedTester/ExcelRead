package package2;

import package1.CalculatorOne;

public class NewCalculator extends CalculatorOne {
	
	public void newCalculator()
	{
		
		System.out.println("New Calculator");
	}
	
	
	public static void main(String[] args)
	{
		
		NewCalculator n = new NewCalculator();
		n.newCalculator();
		
		n.addNumbers();//public
		//n.subNumbers();// private
		n.mulNumbers();//protected
		//n.divNumbers();//default
		
		
		
		
	}
	

}
