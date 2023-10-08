package patternsPract;

public class P130 {

	public static void main(String[] args) {
		for(int i=0; i<8; i++)
		{
			for(int j=0; j<5; j++)
			{
				if((i==5 && j==1)|| (i==0 && j!=0 && j!=4) || (i==6 && j!=0 && j!=4) || (j==0 && i!=0 && i!=6 && i!=7) || (j==4 && i!=0 && i!=6))
					System.out.print("*");
				else
					System.out.print(" ");
		
				
			}
			System.out.println();
		}

	}

}
