import java.util.Arrays;

public class Q10LongestSubsequenceNumbers {

	public static void main(String[] args) {
		int[] a = {2,6,1,9,4,5,3};
		Arrays.sort(a);
		int index=0;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i+1]!=a[i]+1)
			{
				 index=i;
				 break;
			}
			
		}
	for (int i = 0; i <= index; i++) 
	{
		System.out.println(a[i]);
	}
	System.out.println("cnt "+(index+1));
	}

}
