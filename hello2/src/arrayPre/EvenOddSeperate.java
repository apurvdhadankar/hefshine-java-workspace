package arrayPre;

public class EvenOddSeperate {

	public static void main(String[] args) {
		int[] a = {1,3,4,5,6,7,8,9,0};
		int evnind=0;
		int oddind=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				evnind++;
			}
			else
				oddind++;
		}
		int even[] = new int[evnind];
		int odd[] = new int[oddind];
		int ec=0, oc=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				even[ec]= a[i];
				ec++;
			}
			else
			{
				odd[oc]= a[i];
				oc++;
			}
		}
		
		
		for (int i = 0; i < even.length; i++) {
			System.out.print(even[i]);
		}
		System.out.println();
		for (int i = 0; i < odd.length; i++) 
		{
			System.out.print(odd[i]);
		}
		
		

	}

}
