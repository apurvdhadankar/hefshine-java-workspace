package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,2,5,6,18,19,60,80,90,110};
		int min=0;
		int max = arr.length-1;
		int mid;
		int element=110;
		while(min <= max)
		{
			mid=(min+max)/2;
			if(arr[mid]==element)
			{
				System.out.println("Got Success Found at "+mid);
				break;
				
			}
			else if(element>arr[mid])
			{
				min = mid+1;
			}
			else 
			{
				max=mid-1;
			}
			
		}

	}

}
