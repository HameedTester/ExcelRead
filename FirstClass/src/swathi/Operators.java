package swathi;

public class Operators {

	int var1 =10;
	int var2 =2;

	public void arithmatic () {

		System.out.println(var1 + var2);//12
		System.out.println(var1 - var2);//8
		System.out.println(var1 * var2);//20
		System.out.println(var1 / var2);//5
		System.out.println(var1 % var2);//0
		//var1=10
		//var2=2
	}
	public void relationalOperators () {

		System.out.println(var1 < var2);//false	
		System.out.println(var1 > var2);//true
		System.out.println(var1 <= var2);//false
		System.out.println(var1 >= var2);//true	
		System.out.println(var1 == var2);//false
		System.out.println(var1 != var2);//false
	}
	public void incdec () {
		System.out.println(var1); //10             //int var1=10;
		System.out.println(var1++);//10             //int var2=2;
		System.out.println(var1);//11
		System.out.println(++var1);//12
		System.out.println(var1);//12
		System.out.println(var1--);//12
		System.out.println(var1);//11
		System.out.println(--var1);//10



	}

	public static void main(String[] args) {

		Operators a = new Operators ();
		a .arithmatic ();
		a .relationalOperators ();
		a .incdec ();


	}












}
