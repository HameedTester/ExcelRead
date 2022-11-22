
public class PrintStar {

public void starprint () {
	
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)
		{
			if(row==1||row==5||col==1||col==5)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
		
	}
	
	
	
	
	
	
}
public static void main(String[] args) {
	
PrintStar c = new PrintStar ()	;
c.starprint ();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
