package arrayAttempt2;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,5,6,7,8,9,10};
		int min=0;
		int max = a.length-1;
		int mid = 0;
		int search= 10;
		boolean flag = false;
		while(min <= max)
		{
			mid = (min+max)/2;
			if(a[mid] == search)
			{
				System.out.println("Got Success At "+ mid);
				flag=true;
				break;
			}
			else if(search>mid)
			{
				min = mid+1;
			}
			else 
			{
				max = mid-1;
			}
			
		}
		if(flag == false)
			System.out.println("Not Found");
		

	}

}
