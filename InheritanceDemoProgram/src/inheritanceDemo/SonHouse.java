package inheritanceDemo;

public class SonHouse extends FatherHouse {
	
	public void ktmBike()
	{
		
		System.out.println("Sons KTM Bike");
		
	}
	
	public void pursarBike() // implemented methods
	{
		
		System.out.println("Sons Pulsar Bike");
	}
	
	
	public static void main(String[] args)
	{
		
		
		SonHouse s = new SonHouse();
		s.ktmBike();
		s.pursarBike();
		s.audiCar();
		s.porscheCar();
		
		
		
		
	}

}
