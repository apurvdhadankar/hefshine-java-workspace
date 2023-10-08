package patterns;

public class Assignment56 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++)
		{
			int a=0;
			for(int j=0; j<5; j++)
			{
				if(i+j<=3)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(a+1+" ");
					a++;
				}
			}
			System.out.println();
	}

}
}
