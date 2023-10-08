package hello;

public class pattern12 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<=1)
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
