package patternsPract;

public class SeventySeven {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++)
		{
			int a=4, b=0;
			int c=0;
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
				{
					c=i+1+b;
					System.out.print(c+" ");
					b=a+b;
					a--;
				}
			}
			System.out.println();
		}
	}

}
