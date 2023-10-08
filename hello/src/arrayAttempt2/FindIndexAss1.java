package arrayAttempt2;

public class FindIndexAss1 {

	public static void main(String[] args) {
		int[] a = {4,5,6,9,8,1};
		int num = 6;
		for (int i = 0; i < a.length; i++)
		{
			if(num == a[i])
			{
				System.out.print(i);
			}
		}
		

	}

}
