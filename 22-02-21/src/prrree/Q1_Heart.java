package prrree;

public class Q1_Heart {

	public static void main(String[] args) {
		for(int i=0; i<13; i++)
		{
			for (int j = 0; j < 17; j++) 
			{
				if(i+j<3 || i-j>4 || (j-i>5 && i+j<11) || j-i>13 || i+j>20)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
