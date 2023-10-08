package patternsPract;

public class Eighty {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j-i<=0 || i+j>8)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
