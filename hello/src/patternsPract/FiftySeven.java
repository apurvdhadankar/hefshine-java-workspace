package patternsPract;

public class FiftySeven {

	public static void main(String[] args) {
		int a=1;
		for(int i=0; i<5; i++)
		{
			
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
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
