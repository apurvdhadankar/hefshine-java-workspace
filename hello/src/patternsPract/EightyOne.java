package patternsPract;

public class EightyOne {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j-i<=0 || i+j>8)
				{
					if(j<=4)
					{
						System.out.print(j+1);
					}
					else
					{
						System.out.print(10-j);
					}
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
