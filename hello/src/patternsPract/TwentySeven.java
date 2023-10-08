package patternsPract;

public class TwentySeven {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j-i<=0 && i+j<=8)
				{
					if(i<4)
						System.out.print((char)(65+i));
					else
					System.out.print((char)(73-i));
				 
				}
			}
			System.out.println();
		}


	}

}
