package abstractionDemo;

public class SonProperty extends ParentClass1 {

	public void ktmbike () {
		
	System.out.println("ktmbike is a son property");	
		
	}
	public void ring () {
		
	System.out.println("ring is a son property");	
		
	}
	public static void main(String[] args) {
		
		SonProperty s = new SonProperty ();
		s.ktmbike ();//own property
		s.ring ();//own property
		s.audicar ();//father property
		s.house ();//father property
		s.land ();//GRAND FATHER
		s.golds ();//grand father
	}
	
	
	
	
}
