package abstractionDemo;

public class ChildHouseMethod extends FatherHouseMethod {
	
	
	public void ktmBike()
	{
		
		System.out.println("Sons KTM Bike");
	}
	
	public void audiCar()
	{
		
		System.out.println("Sons Audi Car");
	}

	
	
	public static void main(String[] args) {
		
		
		ChildHouseMethod c = new ChildHouseMethod();
		c.ktmBike();// son --> Sons KTM Bike
		c.audiCar();//son--> Sons Audi Car
		c.audiCar();// father--> Fathers Audi Car
		c.porscheCar();//father--> Fathers Porsche Car
		
		
		
		
	}
	
	
	
	
}
