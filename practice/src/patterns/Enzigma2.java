package patterns;

public class Enzigma2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 5; j >= 0; j--) 
			{
				if(j-i<=0)
				{
					System.out.print(j+1);
				}
				if(i==4 && j==5)
				{
					System.out.print(j=0);
				}
				
			}
			System.out.println();
		}
	}

}
