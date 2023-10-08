package patternsPract;

public class ThirtyOne {

	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			int a=0;
			for(int j=0; j<6; j++)
			{
				if(i+j<5 || j-i>5)
				System.out.print(" ");
				else
				{
					System.out.print((char)(65+a)+" ");
					a++;
				}
			}
			System.out.println();
		}

	}

}
