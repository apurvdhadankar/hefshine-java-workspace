package patternsPract;

public class ThrtySeven {

	public static void main(String[] args) {
		
		for(int i=0; i<6; i++)
		{
			int k=65;
			for(int j=0; j<6; j++)
			{
				if(i+j>4)
				{
				System.out.print((char)(k+i));
				k=k+5;
				}
			}
			System.out.println();
		}
	

	}

}
