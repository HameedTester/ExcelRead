package abstractionDemo;

public class ChildClass extends FatherClass {


	public void scientificCalc()
	{

		System.out.println("Scientific Calc");
	}

	public void mulNumbers()
	{
		System.out.println("Mul Numbers");
		
	}


	public void divNumbers()
	{

		System.out.println("Div Numbers");
	}
	
	public static void main(String[] args) {
		
		
		
		ChildClass c = new ChildClass();
		
		c.scientificCalc();// childclass
		c.addNumbers();// father
		c.subNumbers();//father
		
		
		
		
	}

}
