package patterns;

public class Assignment51 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=4 && j-i<=4 && j-i>=-4 && j+i<=12)
				{
					if(i<=4)
						System.out.print(i+1+" ");
					else
						System.out.print(9-i+" ");
				}	
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
