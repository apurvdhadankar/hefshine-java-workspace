package patternsPract;

public class SeventyThree {

	public static void main(String[] args) {
		for(int i=0; i<9; i=i+2)
		{
			int a=65;
			for(int j=0; j<9; j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)a);
					if(j<(i-j))
						a++;
					else
						a--;
					
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
