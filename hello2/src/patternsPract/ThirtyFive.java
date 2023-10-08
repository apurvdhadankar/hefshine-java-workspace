package patternsPract;

public class ThirtyFive {

	public static void main(String[] args) {
		int a=65;
		for(int i=0; i<6; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(i+j>4) {
				System.out.print((char)a);
				a++;
				}
			}
			System.out.println();
		}

	}

}
