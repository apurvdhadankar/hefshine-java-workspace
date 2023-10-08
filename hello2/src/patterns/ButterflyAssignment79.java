package patterns;

public class ButterflyAssignment79 {

	public static void main(String[] args) {
		for(int i=0; i<8; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i<=0 && i+j<=6 || i+j>7 && j-i>1)//|| i+j<9 && j-i<1
//				if(j-i>0 && i+j<9 || i+j>8 && j-i<1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
