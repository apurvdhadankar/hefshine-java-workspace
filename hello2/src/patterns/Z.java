package patterns;

public class Z {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(i==0||j<=5)
					System.out.print("*");
			}
		}

	}

}
