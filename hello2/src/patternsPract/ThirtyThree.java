package patternsPract;

public class ThirtyThree {

	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(j-i<=0)
				System.out.print((char)(70-j));
			}
			System.out.println();
		}

	}

}
