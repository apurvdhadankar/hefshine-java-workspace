package patternsPract;

public class NinetyOne {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(i+j==4)
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
