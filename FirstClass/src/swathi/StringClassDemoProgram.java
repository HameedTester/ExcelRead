package swathi;

public class StringClassDemoProgram {
	
	
	String s1= "Oranium Tech Chrompet & Velachery 14th Cross 194843874576"; // ORANIUM TECH CHROMPET & VELACHERY
	
	String s2="Oranium Tech Software Training Institute"; //
	
	String s3="";
	
	
	public void stringDemo()
	{
		
		// to know about the string length , then we do have a method called length().
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println("========================================>");
		
		// toUpperCase--> we can change the lowercase into upperCase
		
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		

		System.out.println("***************************************************");
		
		// toLowerCase--> we can change the uppercase into lowercase
		
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println("***************************************************");
		
		//isEmpty()--> true/false
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		
		System.out.println("****************************************************");
		
		System.out.println(s1.equals(s2));
		
		System.out.println("************************************************");
		
		// replace()
		
		System.out.println(s1.replace("Oranium", "Selenium Vellore"));
		
		System.out.println("******************************************");
		
		// concat()
		
		System.out.println(s1.concat("14th Street, New Colony, Chrompet"));
		
		// index()
		
		System.out.println(s1.indexOf("T"));
		
		// char
		
		System.out.println(s1.charAt(8));
		
		//contains
		
		System.out.println(s1.contains("Tambaram"));
		
		//startsWith()
		
		System.out.println(s2.startsWith("r"));
		
		System.out.println(s2.startsWith("O"));
		
		
		//endsWith
		
		System.out.println(s1.endsWith("W"));
		
		System.out.println(s1.endsWith("y"));
		
		//replaceAll
		
		System.out.println(s1.replaceAll("[A-Z]", ""));
		
		System.out.println(s1.replaceAll("[^A-Z]", ""));
		
		System.out.println(s1.replaceAll("[^0-9]", ""));
		
		//split
		
		//tocharArray
		
		
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		
		StringClassDemoProgram s = new StringClassDemoProgram();
		s.stringDemo();
		
	}
	
}
