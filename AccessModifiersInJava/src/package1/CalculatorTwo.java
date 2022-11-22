package package1;

public class CalculatorTwo extends CalculatorOne {
	
	public void scientificCalc()
	{
		
		System.out.println("Scientific Calc");
	}
	
	
	public static void main(String[] args) {
		
		CalculatorTwo c = new CalculatorTwo();
		c.scientificCalc();// child
		c.addNumbers();// public
		//c.subNumbers();//private
		c.mulNumbers();//protected
		c.divNumbers();//default
		
	}

}
