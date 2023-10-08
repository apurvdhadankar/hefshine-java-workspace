package patterns;

public class Enzigma {

	public static void main(String[] args) {
		int a=0, b=0, sum=0, cnt=0;
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				if(a+b==sum)
				{
					if(j<=cnt)
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			if(i%2!=0)
			{
				a++;
				b++;
				sum = a+b;
				cnt=cnt+2;
			}
			
			
			System.out.println();
			
		}

	}

}
