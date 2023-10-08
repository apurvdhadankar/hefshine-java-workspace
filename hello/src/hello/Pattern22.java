package hello;

public class Pattern22 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<=0)
				{
					System.out.print(giveMeVal(i,j));
				}
			}
			System.out.println();
		}

	}

	private static int giveMeVal(int i, int j) {
		if(j==0)
			return 1;
		if(j==i)
			return 1;
		return giveMeVal(i-1, j-1) + giveMeVal(i-1, j);
	}

}
