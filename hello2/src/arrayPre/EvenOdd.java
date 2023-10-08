package arrayPre;

public class EvenOdd {

	public static void main(String[] args) {
		int[] a =  {1,5,8,9,6,3,1,4,7,3,43,5,6,78};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]%2!=0 && a[j]%2==0)
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
