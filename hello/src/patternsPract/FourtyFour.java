package patternsPract;

public class FourtyFour {

	public static void main(String[] args) {
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<6; j++)
			{
				if(i+j<=5)
				{
				System.out.print(" ");
				}
				else
					System.out.print(i+" ");
			}
			System.out.println();
		}

	}
}


