package abstractionDemo;

public class ChildClassOne extends ParentClass {


	public void biCycle()
	{

		System.out.println("Sons Bi Cycle");
	}

	public void ktmBike()
	{

		System.out.println("Sons Ktm Bike");
	}

	public static void main(String[] args) {

		ChildClassOne c = new ChildClassOne();
		c.biCycle();// child
		c.ktmBike();// child
		c.benzzCar();// father
		c.fathersHome();//father
		c.oldHeritageHome();//grand father


	}


}
