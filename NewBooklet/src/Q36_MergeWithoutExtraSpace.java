
public class Q36_MergeWithoutExtraSpace {

	public static void main(String[] args) {
		int[] a = {10, 12};
		int[] b = {5, 18, 20};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]>b[j])
				{
					int temp = a[i];
					a[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
