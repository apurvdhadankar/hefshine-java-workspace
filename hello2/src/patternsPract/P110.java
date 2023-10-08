package patternsPract;

public class P110 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			int a=5;
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
				{
					System.out.print(5-(i-j));
				}
				else
					System.out.print("5");
		
			}
			System.out.println();
		}


	}
}

