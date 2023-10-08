package arrays;

public class FindIndexNumber {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		int b=30;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==b)
			{
				System.out.println("Element found at position "+i);
				break;
			}
		}
		

	}

}
