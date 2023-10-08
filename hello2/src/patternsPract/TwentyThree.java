package patternsPract;

public class TwentyThree {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			
			for(int j=0; j<9; j++)
			{
				if(j-i<0 && i+j<8 || j-i>4 || i+j>12)
//				if((i+j<13&&j-i<5)&&(i+j>=8 ||j-i>=0))// 
				{
				 System.out.print(" ");
				}
				else 
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
