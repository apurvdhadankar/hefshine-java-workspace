package array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int n=7;
		int min=0;
		int max=a.length-1;
		int count=0;
		while(min<=max)
		{
			int mid=(min+max)/2;
			{
				if(a[mid]==n)
				{
					System.out.println("Found at "+mid);
					count++;
					break;
				}
				else if(n>mid)
				{
					min=mid+1;
				}
				else
				{
					max=mid-1;
				}
			}
		}
		if(count==0)
		{
			System.out.println("Not Found");
		}

	}

}
