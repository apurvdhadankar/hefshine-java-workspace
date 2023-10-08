package gsLab;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a=5, b=8;
		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println(a);
		System.out.println(b);
		
		int[] arr = {5,6,9,8,4,1,2};
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(arr[i]>arr[i+1])
			{
				arr[i] = arr[i] + arr[i+1];
				arr[i+1] = arr[i] - arr[i+1];
				arr[i] = arr[i] - arr[i+1];
				i = -1;
			}
		}
		
		System.out.println("After Sorting");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
