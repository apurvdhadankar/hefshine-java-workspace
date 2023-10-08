package patterns;

public class Assignment71 {

	public static void main(String[] args) {
		for(int i=0 ;i<5; i++)
		{
			
			
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
				{
					System.out.print(j+1);
				}
			}
			for (int j = 0; j < 9; j++) 
			{
				if(i+j>8)
				System.out.print(9-j);
			}
			System.out.println();
		}
	}

}
                                                                                                                                                                                