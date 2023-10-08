package patternsPract;

public class EightyTwo {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			int a=1;
			for(int j=0; j<10; j++)
			{
				if(j-i<=0 || i+j>8)
				{
					System.out.print(i+1);
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
