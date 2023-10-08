package cntrlStmnt2;

public class HW20 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 7; j++) 
			{
				if(i+j<3 || j-i>3)
				{
					System.out.print("");
				}
				else
				{
					if(j>3)
					{
						System.out.print(j-2);
					}
					else
					{
						System.out.print(4-j);
					}
					
				}
			}
			System.out.println();
		}

	}

}
