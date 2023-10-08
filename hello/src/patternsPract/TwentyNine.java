package patternsPract;

public class TwentyNine {

	public static void main(String[] args) {
		for(int i=0; i<12; i++)
		{
			int a=0;
			for(int j=0; j<6; j++)
			{
				if(j+i<=5 || j-i<=-6)
				{
					System.out.print((char)(65+j));
				}
			}
			System.out.println();
		}

	}

}
