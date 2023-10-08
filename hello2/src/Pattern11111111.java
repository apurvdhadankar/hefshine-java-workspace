
public class Pattern11111111 
{

public static void main(String[] args)
{
	int a=1;
	for (int i = 0; i <= 5; i++)
	{
	for (int j = 0; j <5; j++)
	{
		if(i+j>4)
		{
				for (int j2 = 0; j2 < 1; j2++) 
				{
					System.out.print(a);
				}
				for (int j2 = 2; j2 < 4; j2--)
				{
					System.out.print(j2);
				}

				
		}
		else
			System.out.print(" ");
	}
	System.out.println();
	}
}
}
