package arrayPre;

public class FindIndexOfArray {

	public static void main(String[] args) {
		int[] a= {1,5,8,9,6,3};
		int n=8;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n)
			{
				System.out.println("Found at "+i);
			}
		}

	}

}
