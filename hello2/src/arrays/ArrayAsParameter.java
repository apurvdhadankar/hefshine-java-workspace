package arrays;

public class ArrayAsParameter {
	int arrr(int arr[])
	{
		int sum=0;
		for(int i=0 ;i<arr.length; i++)
		{
			sum= sum+arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayAsParameter obj = new ArrayAsParameter();
		int a[] = {1,2,3,4,5};
		int sum = obj.arrr(a);
		System.out.println(sum);
	}
}
