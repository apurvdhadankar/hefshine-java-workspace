package patterns;

public class Assignment55 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<=0 && i+j<=8)
					System.out.print(j+1);
			}
			System.out.println();
		}

	}

}
