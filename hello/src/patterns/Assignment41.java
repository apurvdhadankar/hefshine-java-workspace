package patterns;

public class Assignment41 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j-i<0 || i+j<2)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();

	}

}
}
