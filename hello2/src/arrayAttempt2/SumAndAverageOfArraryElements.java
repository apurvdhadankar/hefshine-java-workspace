package arrayAttempt2;

public class SumAndAverageOfArraryElements {

	public static void main(String[] args) {
		int[] a = {4,5,6,9,8,5,2};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum += a[i];
		}
		System.out.println(sum);
		double avg = sum/a.length;
		System.out.println(avg);
	}

}
