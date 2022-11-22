package abstractionDemo;

public class Dc extends ParentClass1 {

public void scooty ()	{
	
System.out.println("scooty is a dc property");	
	
	
}
public void oldhouse () {
	
	System.out.println("oldhouse is a dc property");
	
}
public static void main(String[] args) {
	Dc d = new Dc ();
	d.scooty ();//dc property
	d.oldhouse ();//own nproperty
	d.house ();
	d.audicar ();
	
}
	
	
	
	
	
	
	
}
