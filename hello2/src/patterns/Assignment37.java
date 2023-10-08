package patterns;

public class Assignment37 {

	public static void main(String[] args) {
		char a = 'A';
		for(int i=0; i<6; i++)
		{
			char b=a;
			for(int j=0; j<6; j++)
			{
				if(j-i<=0)
				{
					System.out.print(b);
				}
				b=(char)(b+5);
				
			}
			a++;
			System.out.println();
		}

}
}
