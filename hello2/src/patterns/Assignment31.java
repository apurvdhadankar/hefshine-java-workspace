package patterns;

public class Assignment31 {
public static void main(String[] args) {
	int a=65;
	for(int i=0; i<6; i++)
	{
		for(int j=0; j<6; j++)
		{
			if(i+j>=5 && j-i<=5)
			{
				System.out.print((char)(60+(i+j))+" ");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
