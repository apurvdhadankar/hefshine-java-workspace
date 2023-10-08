package arrays;

public class FindEvvenOddInArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int evenal=0;
		int oddal=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				evenal++;
			else
				oddal++;
			
		}
		int even[] = new int[evenal];
		int odd[] = new int[oddal];
		int ec=0, oc=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				even[ec]=arr[i];
				ec++;
			}
			else
			{
				odd[oc]=arr[i];
				oc++;
			}
		}
		for(int i=0; i<even.length; i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for(int i=0; i<odd.length; i++)
		{
			System.out.print(odd[i]+" ");
		}
	}

}
