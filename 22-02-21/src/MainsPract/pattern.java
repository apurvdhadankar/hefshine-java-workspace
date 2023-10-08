package MainsPract;

public class pattern {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(i+j>=4)
				{
					if(j==4)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("*-");
					}
					
				}
				else
				{
					System.out.print("-");
				}
			}
			for (int j = 0; j < 5; j++) 
			{
				if(i+j<=3)
				{
					System.out.print("-");
				}
			}
			System.out.println();
			}

	}

}
