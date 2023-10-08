package arrarPre2;

public class Binary {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int search=8;
		int min=0;
		int max=a.length-1;
		boolean flag = false;
		while(min<=max)
		{
		int mid = (min+max)/2;
		if(a[mid]==search)
		{
			System.out.println("Element Found At "+mid);
			flag=true;
			break;
		}
		else if(search > a[mid])
		{
			min = mid+1;
		}
		else
		{
			max = mid-1;
		}
					
		}
		if(flag==false)
		{
			System.out.println("Not Found");
		}
	}

}
