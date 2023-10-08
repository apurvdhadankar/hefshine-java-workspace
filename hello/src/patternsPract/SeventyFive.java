package patternsPract;

public class SeventyFive {

	public static void main(String[] args) {
		int a=-2;
		for(int i=3; i<11; i=i+2)
		{
			
			for(int j=0; j<11; j++)
			{
				if(j-i<=-1)
				{
					if(j-i==a)
					{
						System.out.print(" ");
						a--;
					}
					
					else
					{
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}	


	}

}
