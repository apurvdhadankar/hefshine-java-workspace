package patterns;

public class IncementDecrementHef {

	public static void main(String[] args)
	{
		/*for(int i=0; i<=6; i++) 
		{
			for(int j=0; j<=6; j++) 
			{
//				if(j+i>=6)
				if(j+i<=6 && j-i<=6)
				{
					System.out.print("*");
				}
				
			}*/
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print("*");
			}
		if(i!=5)	
		System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5-i;j<=5;j++)
			{
			   System.out.print("*");	
			}
		System.out.println();
		}
		System.out.println("-------");
		
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
		}
		
	}

}
