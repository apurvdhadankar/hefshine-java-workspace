package patternsPract;

public class FiftyThree {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			int a=1;
			for(int j=0; j<9; j++)
			{
				if(i+j>=8)
				{
					System.out.print(a+" ");
					a++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
