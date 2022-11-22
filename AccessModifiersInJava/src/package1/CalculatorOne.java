package package1;

public class CalculatorOne {

	public void addNumbers()
	{

		System.out.println("Public Add Numbers");
	}

	private void subNumbers()
	{

		System.out.println("Private Sub Numbers");
	}

	protected void mulNumbers()
	{
		System.out.println("Protected Mul Numbers");

	}


	void divNumbers() // void--> default
	{

		System.out.println("Default Div Numbers");
	}
	
	
	public static void main(String[] args) {
		
		CalculatorOne c = new CalculatorOne();
		c.addNumbers();// public
		c.subNumbers();// private
		c.mulNumbers();// protected--> 
		c.divNumbers();// default--> single--> all classes
		
		
	}
}



