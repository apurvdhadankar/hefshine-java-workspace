package arrayAttempt2;

public class SpecificValueAss2 {

	public static void main(String[] args) {
		int[] a = {5,6,9,8,7,1,5};
		int num = 6;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==num)
			{
				System.out.println(a[i]);
			}
		}

	}

}
