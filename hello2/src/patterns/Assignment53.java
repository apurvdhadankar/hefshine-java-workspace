package patterns;

public class Assignment53 {

	public static void main(String[] args) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(i+j>=8 /*&& j-i<=8*/)
					System.out.print(i+j-7+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}

	}
		
}
