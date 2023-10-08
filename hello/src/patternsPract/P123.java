package patternsPract;

public class P123 {

	public static void main(String[] args) {
		for(int i=0; i<7; i++)
		{
			for(int j=0; j<5; j++)
			{
				if((i==6 && j<3) || (j==0 && i>4) || i==0 || j==2 )
					System.out.print("*");
				else
					System.out.print(" ");
		
				
			}
			System.out.println();
		}


	}

}
