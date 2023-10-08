package patterns;

public class Assignment54 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(j-i>=0 && i+j<=16)
					System.out.print(9-i+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
