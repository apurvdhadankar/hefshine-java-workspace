package arrayPre;

public class SumAvgArrElements {

	public static void main(String[] args) {
		int a[] = {2,5,6,9,8,3};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum is "+sum);
		int avg = sum/a.length;
		System.out.println("Average is "+avg);

	}

}
