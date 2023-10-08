package patternsPract;

public class FiftyEight {

	public static void main(String[] args) {
		int a=1;
		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(i+j<=4 || j-i<=-4)
				{
					System.out.print(j+1);
					a++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
