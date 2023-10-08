package arrays;

public class ReverseUsingThirdVar {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		for(int i=0; i<arr.length/2; i++)
		{
			int p=arr[i];
			int q=arr[arr.length-1-i];
			arr[i]=q;
			arr[arr.length-1-i]=p;
			
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
