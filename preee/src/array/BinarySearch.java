package array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int search = 17;
		int cnt=0;
		int min=0, max = a.length-1;
		while(min<=max)
		{
			int mid=(min+max)/2;
			if(a[mid]==search)
			{
				System.out.println("Element Found at "+mid);
				cnt++;
				break;
			}
			else if(search > mid)
			{
				min = mid+1;
			}
			else
			{
				max = mid-1;
			}
		}
		if(cnt==0)
		{
			System.out.println("Not found");
		}

	}

}
