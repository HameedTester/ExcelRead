package package1;

public class ChildClass {
	
	
	ChildClass()
	{
		
		
	}
	
	public void addNumbers()
	{
		
		System.out.println("Child Class Add Numbers");
	}
	
	public void subNumbers()
	{
		
		System.out.println("Child Class Sub Numbers");
	}
	
	public static void main(String[] args) {
		
		
		ChildClass c = new ChildClass();
		c.addNumbers();// child
		c.subNumbers();//child
		c.subNumbers();//parent
	}

}
