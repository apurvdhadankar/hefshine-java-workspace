package patternsPract;

public class P113 {

	public static void main(String[] args) {
		for(int i=0; i<11; i++)
		{
			for(int j=0; j<15; j++)
			{
				if(i+j<2 || j-i<-3 || (j-i>4 && i+j<10) || j-i>12 || i+j>17)
					System.out.print(" ");
				else
					System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
