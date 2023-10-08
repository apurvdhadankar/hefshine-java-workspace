package cntrlStmnt2;

public class HW14 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
		{
	
			for (int j = 5; j >= 0; j--) 
			{
				if(j-i<=0)
				{
					System.out.print(j+1);
				}
			}
			System.out.println();
		}

	}

}
