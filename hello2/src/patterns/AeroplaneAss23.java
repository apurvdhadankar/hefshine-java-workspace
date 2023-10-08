package patterns;

public class AeroplaneAss23 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i<0 && i+j<8 || j-i>4 || i+j>12 )
					System.out.print(" ");
//				else if(i+j>=4 && i+j<=8)
//					System.out.print("*");
				else
					System.out.print("*");
			}
			System.out.println();
		}


	}

}
