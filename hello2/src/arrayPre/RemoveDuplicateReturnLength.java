package arrayPre;

public class RemoveDuplicateReturnLength {

	public static void main(String[] args) {
		int[] a = {2,4,5,6,2,5,4,1};
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}
		System.out.println(a.length-count);

	}

}
