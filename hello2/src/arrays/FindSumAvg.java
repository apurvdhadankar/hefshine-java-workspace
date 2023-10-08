package arrays;

public class FindSumAvg {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		int sum=0;
		for(int i=0; i<6; i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
		sum = sum/arr.length;
		System.out.println("Average is "+sum);

	}

}
