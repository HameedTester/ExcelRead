package swathi;

public class ArrayConcept {

int var1 =10;
int arr []= {12,45,89,56,78};

public void array () {
	
	System.out.println(var1);//10
	System.out.println(arr);//address
	System.out.println(arr[1]);//45
	System.out.println(arr[0]);//12
	System.out.println(arr[2]);//89
	System.out.println(arr[3]);//56
	System.out.println(arr[4]);//78
	
	
	System.out.println("iterating array using normal forloop");
	
	for(int i =0;i<=4;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("reversing array");
	for(int i=4;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {

ArrayConcept a = new ArrayConcept ();
a .array ();
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
