package pre2;

public class pattern
{
public static void main(String[] args) 
{
	for (int i = 0; i < 5; i++) 
	{
		for (int j = 0; j < 9; j++)
		{
			if (i+j>=4 && j<5)
			{
				System.out.print((char)(i+j-3+64));
			}
			else if (j-i<5 && j>=5)
			{
				System.out.print((char)(i-j+69));
			}
			else 
			{System.out.print(" ");}
		}
		System.out.println();
	}
}	
}
