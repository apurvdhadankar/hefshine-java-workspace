package recursion;

public class FindElementInArray {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,7,8,6,9};
		int b=6;
		checkInA(a, b, 0);
		
		}

	private static void checkInA(int[] a, int b, int i) {
		if(i<a.length)
		{
			if(a[i]==b)
			{
				System.out.println("Found at index: "+i);
			}
			checkInA(a, b, ++i);
		
	}

	}

}
