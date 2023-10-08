package NewBooklet;


public class Q7MaxSumOfAi {

	public static void main(String[] args) {
		int[] a = {8,3,1,2};
		int res= Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) 
		{
			int curr_sum=0;
			for (int j = 0; j < a.length; j++) 
			{
				int index = (i+j)%a.length;
				curr_sum += j*a[index];
			}
			res = Math.max(res, curr_sum);
			
		}
		System.out.println(res);

	}

}
