package arrayPre;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] a = {7,5,8,9,1};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
//		for (int i = 0; i < a.length; i++) {
			System.out.println("Second Largest is "+a[a.length-2]);
//			System.out.println(a[i]);
//		}

	}

}
