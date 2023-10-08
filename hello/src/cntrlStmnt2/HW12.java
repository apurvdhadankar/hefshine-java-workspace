package cntrlStmnt2;

public class HW12 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<2)
				{
					System.out.print(j+1);
				}
			}
			System.out.println();
		}

	}

}
