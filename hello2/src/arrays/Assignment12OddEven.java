package arrays;

public class Assignment12OddEven {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int evenal=0, oddal=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				evenal++;
			else
				oddal++;
			
		}
			
		int even[] = new int[evenal];
		int odd[] = new int[oddal];
		int ec=0, oc=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0) {
				even[ec]=a[i];
				ec++;
			}
				
			else {
				odd[oc]=a[i];
				oc++;
			}
				
			
		}
		
		for(int i=0; i<even.length; i++)
			System.out.print(even[i]);
		System.out.println();
		for(int i=0; i<odd.length; i++)
			System.out.print(odd[i]);

	}

}
