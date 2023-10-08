package patternsPract;

public class ThirtyEight {

	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
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
