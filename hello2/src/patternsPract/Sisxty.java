package patternsPract;

public class Sisxty {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			int a=1;
			for(int j=0; j<5; j++)
			{
				if(j-i>=0 || i+j>=8)
//					     j-i<0  && i+j<8 || i+j>7 && j-i>0
				{
					System.out.print(j+1+" ") ;
					a++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}	

	}

}
