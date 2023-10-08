package arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[]= {4,5,9,8,1};
		int n=arr.length;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+i; j<arr.length; j++)
			{
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		
		}
		System.out.println();
		System.out.println("Second largest Number is  "+arr[n-2]);
		
	
		

	}

}
