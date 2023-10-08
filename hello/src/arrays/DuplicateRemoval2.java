package arrays;

public class DuplicateRemoval2 {

	public static void main(String[] args) {
		int[] a = {1,5,6,9,6,1,2,3,4,5,4};
		int count=0;
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
//					a[j]=0;
					count++;
					break;
				}
			}
		}
		System.out.println("Count is : "+count);
		System.out.println("Old Array length is : "+(a.length));
		System.out.println("New Array lenght is : "+ (a.length - count));
		
//		int temp[] = new int[a.length-];
		
		  
	}

}
