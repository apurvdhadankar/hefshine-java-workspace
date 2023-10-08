package patternsPract;

public class EightyThree {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			int a=1,b=1;
			for(int j=0; j<10; j++)
			{
				if(j-i<=0 || i+j>8)
				{
					if(j<=4)
					{
						System.out.print(a);
						a++;
					}
					else
					{
						System.out.print(b);
						b++;
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
