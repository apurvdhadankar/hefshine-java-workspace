package patterns;

public class Assignment59 {

	public static void main(String[] args) {
		for(int i=0 ;i<9; i++)
		{
			int a=0;
			for(int j=0; j<5; j++)
			{
				if(j-i<0 && i+j<8)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(a+1);
					a++;
				}
			}
			System.out.println();
	}

}
}
