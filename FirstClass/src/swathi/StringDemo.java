package swathi;

public class StringDemo {


	String s1= "Oranium Tech Chrompet & Velachery";

	String s2="Oranium Tech Chrompet";
	
	String s3="";


	public void stringDemoPattern()
	{
		System.out.println(s2.isEmpty());
		
		System.out.println();

//		System.out.println(s1.length());
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.startsWith("V"));
//		System.out.println(s1.endsWith("T"));
//		System.out.println(s1.trim());
//		System.out.println(s1.charAt(2));
//		System.out.println(s1.indexOf("O"));
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.concat("Vellore"));
//		System.out.println(s1.replace("Oranium", "Selenium"));
//		System.out.println(s1.replaceAll("[A-Z]",""));
//		System.out.println(s1.replaceAll("[a-z]", ""));
		
		String[] split = s1.split(" ");
		
		for(int i=0; i<split.length;i++)
			
		{
			
			System.out.println(split[i]);
		}
		
		
	}

	public static void main(String[] args) {


		StringDemo s = new StringDemo();

		s.stringDemoPattern();

	}

}
