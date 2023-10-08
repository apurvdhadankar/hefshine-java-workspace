package patternsPract;

public class FiftyTwo {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if(i+j>=8)
				{
					System.out.print(i+1+" ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
