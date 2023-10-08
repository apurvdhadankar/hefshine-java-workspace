package patternsPract;

public class SeventyTwo {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			int a=1;
			for(int j=0; j<9; j++)
			{
				if(i+j<4 || j-i>4)
				{
					System.out.print(" ");
//					if(j<(i-j))
//					{
//						a++;
//					}
//					else
//						a--;
				}
				else
				{
					System.out.print(a);
					if(j<4)
						a++;
					else
						a--;
					
				}
			}
			System.out.println();
		}


	}

}
