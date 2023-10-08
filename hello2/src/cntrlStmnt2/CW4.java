package cntrlStmnt2;

public class CW4 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i+j<=4 || j-i<=-4)
				{
					if(i<5)
					{
						System.out.print(j+i+1);
					}
					
					else
					{
						System.out.print(9-(i-j));	
					}
				}
			}
			System.out.println();
		}

	}

}
