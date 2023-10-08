package arrayAttempt2;

public class EvenOddAss12 {

	public static void main(String[] args) {
		int[] a = {1,5,9,8,6,3,2,2,1,4,8,55,69,52,36,37};
		int evencnt = 0;
		int oddcnt = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				evencnt++;
			}
			else
			{
				oddcnt++;
			}
				
		}
		int even[] = new int[evencnt];
		int odd[] = new int[oddcnt];
		int ec=0, oc=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				even[ec]=a[i];
				ec++;
			}
			else
			{
				odd[oc]=a[i];
				oc++;
			}
		}
		for (int i = 0; i < even.length; i++) 
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < odd.length; i++) 
		{
			System.out.print(odd[i]+" ");
		}
	}

}
