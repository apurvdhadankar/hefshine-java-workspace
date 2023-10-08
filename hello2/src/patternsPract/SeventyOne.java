package patternsPract;

public class SeventyOne {

	public static void main(String[] args) {
		for(int i=0; i<9; i=i+2)
		{
			int a=1;
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
				{
					System.out.print(a);
					if(j<(i-j))
					{
						a++;
					}
					else
						a--;
				}
				
			}
			System.out.println();
		}


	}

}
