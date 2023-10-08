package array;

public class EvenOdd {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int even=0;
		int odd=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		int ev[] = new int[even];
		int od[] = new int[odd];
		int evindex=0, odindex=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				ev[evindex++] = a[i];
			}
			else
				od[odindex++]=a[i];
		}
		for (int i = 0; i < ev.length; i++) 
		{
			System.out.print(ev[i]);
		}
		System.out.println();
		for (int i = 0; i < od.length; i++) 
		{
			System.out.print(od[i]);
		}
	}
	

}
