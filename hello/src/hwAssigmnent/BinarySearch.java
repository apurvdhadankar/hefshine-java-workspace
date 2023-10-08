package hwAssigmnent;

public class BinarySearch {

	public static void main(String[] args) {
//		Selection sort
//		int arr[] = {1,2,3,4,5,6,7,8,20,50,80};
		int arr[] = {5,4,2,1,3,7,8,9,6};
		for(int i=0 ; i<arr.length; i++)
		{
			int min=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[min] > arr[j])
				{
					min = j;
				}
//				int p = arr[i];
//				int q= arr[i+1];
//				arr[i]=q;
//				arr[i+1]=p;
			}
			int p = arr[i];
			int q= arr[min];
			arr[i]=q;
			arr[min]=p;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		Binary Search
		
		int min=0;
		int max=arr.length-1;
		int mid=0;
		int find=91;
		boolean flag=false;
		while(min<=max)
		{
			mid = (min+max)/2;
			if(arr[mid]==find)
			{
				System.out.println("Got Success at "+mid);
				flag=true;
			
			}
			else if(find>arr[mid])
			{
				min = mid+1;
			}
			else if(find<arr[mid])
			{
				max = mid-1;
			}
			else if(arr[mid] != find)
			{
				System.out.println("Not Found");
			}
		}
		if(flag==false)
			System.out.println("Not Found");
		
		

	}

}
