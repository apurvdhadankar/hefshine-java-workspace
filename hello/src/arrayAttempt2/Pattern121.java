package arrayAttempt2;

public class Pattern121 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<=0)
				{
					System.out.print(find(i, j));
				}
			}
			System.out.println();
		}

	}

	private static int find(int i, int j) {
		if(j==0 || j-i==0)
		{
			return 1;
		}
		return find(i-1, j-1)+find(i-1,j);
		
	}
}
