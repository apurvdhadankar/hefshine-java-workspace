package patternsPract;

public class FiftyNine {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			int a=1;
			for(int j=0; j<5; j++)
			{
				if(j-i>=0 || i+j>=8)
				{
					System.out.print(a);
					a++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
