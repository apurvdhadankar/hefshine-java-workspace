package pract;

public class Spiral {

	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{
				if(i==j)
				{
					System.out.print(j);
				}
				
			}
			System.out.println();
		}
	}

}
