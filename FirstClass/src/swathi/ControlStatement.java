package swathi;

public class ControlStatement {

	String s1 ="oranium tech";
	String s2 ="java programming";
	String s3 = new String ("oranium tech");
	
	public void array() {
	System.out.println(s1);//oranium tech
	System.out.println(s2);//java programming
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());//
	System.out.println(s1.hashCode());
	
	s1="porshecar";
	
	System.out.println(s1.hashCode());
	System.out.println(s1.toUpperCase());//PORSHECAR
	System.out.println(s1.toLowerCase());//porshecar
	System.out.println(s1.contains("car"));//true
	System.out.println(s1.isEmpty());//false
	System.out.println(s1.contentEquals(s1));
} 
				
public static void main(String[] args) {
ControlStatement c	 = new ControlStatement ();
c. array();
	
	
	
	
}

	
	
	
}
