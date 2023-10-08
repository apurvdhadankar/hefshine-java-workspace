package recursion;

public class printArray {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		printArray(a, 0);

	}

	private static void printArray(int[] a, int i) {
		if(i<a.length)
		{
			System.out.print(a[i]+" ");
			printArray(a, ++i);
		}
		
	}

}
