package patternsPract;

public class EightyFive {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			int a=1;
			for(int j=0; j<5; j++)
			{
				if(i==2 || j==2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}

}
