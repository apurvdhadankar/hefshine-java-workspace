package hello;

public class Pattern18 {

	public static void main(String[] args) {
		for (int i = 0; i < 18; i=i+2) 
		{
			for (int j = 0; j < 9; j++) 
			{
				if(j-i<=0 && i+j<=16)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
