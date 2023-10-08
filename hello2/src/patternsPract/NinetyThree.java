package patternsPract;

public class NinetyThree {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i==0 || i+j==8)
				{
					System.out.print("N");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
