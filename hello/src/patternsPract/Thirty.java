package patternsPract;

public class Thirty {

	public static void main(String[] args) {
		for(int i=0; i<12; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(j+i<=5 || j-i<=-6)
				{
					if(i<6)
						System.out.print((char)(70-(i+j)));
					else
						System.out.print((char)(59+(i-j)));
				}
			}
			System.out.println();
		}

	}

}
