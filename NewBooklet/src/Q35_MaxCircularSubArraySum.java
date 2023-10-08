
public class Q35_MaxCircularSubArraySum {

	public static void main(String[] args) {
		int a[] = {10,-3,-4,7,6,5,-4,-1};
		int temp = a[a.length-1];
		for (int i = a.length-1; i > 0; i--) 
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int sum=0;
		int max= Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);
	}

}
