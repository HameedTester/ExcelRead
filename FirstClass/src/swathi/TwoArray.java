package swathi;

public class TwoArray {

	String s1 = "oranium tech";
	String s2 = new String ("java programming");
	String s3 = "chennai";


	public void PrintArray () {

		System.out.println(s1);//oranium tech
		System.out.println(s2);//java programming
		System.out.println(s3);//chennai

		System.out.println(s1.hashCode());//address
		System.out.println(s2.hashCode());//address
		System.out.println(s1.hashCode());//same address
		System.out.println(s3.hashCode());//address

		System.out.println(s1.toUpperCase());//ORANIUM TECH
		System.out.println(s1.toLowerCase());//oranium tech

		System.out.println(s1.endsWith("ch"));
		System.out.println(s1.endsWith("od"));
		System.out.println(s2.startsWith("ja"));
		System.out.println(s3.substring(5));
		System.out.println(s1.length());

	}
	public static void main(String[] args) {

		TwoArray t = new TwoArray ();
		t.PrintArray();



	}



}
