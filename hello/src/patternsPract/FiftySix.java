package patternsPract;

public class FiftySix {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			int a=1;
			for(int j=0; j<5; j++)
			{
				if(i+j>=4)
				{
					System.out.print(a+" ");
					a++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
