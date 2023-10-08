package patternsPract;

public class P120 {

	public static void main(String[] args) {
		for(int i=0; i<7; i++)
		{
			for(int j=0; j<6; j++)
			{
				if((i==3 && j>2) || (j==4 && i>3) || (i==0 && j!=5) || j==0 || (i==6 && j!=5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
