package patternsPract;

public class FourtyNine {

	public static void main(String[] args) {
		
		for(int i=0; i<9; i++)
		{
			int a=1;
			for(int j=0; j<9; j++)
			{
				if(i+j<8)
					System.out.print(" ");
				else
				{
					System.out.print(a);
					a++;
				}
			}
			System.out.println();
		}
	}

}
