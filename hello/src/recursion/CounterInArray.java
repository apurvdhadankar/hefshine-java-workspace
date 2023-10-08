package recursion;

public class CounterInArray {

	static int count;
	public static void main(String[] args) {
		
		int[] a = {0,1,2,7,3,4,7,5,6,7,8,7,9};
		int b=7;
		count=0;
		checkInArray(a,0,b);
		System.out.println(count);
	}

	private static void checkInArray(int[] a, int i, int b) {
		if(i<a.length)
		{
			if(a[i]==b)
			{
				count++;
			}
			checkInArray(a, ++i, b);
		}
		
	}

}
