package arrayPre;

public class SeedsMinDistance {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,69,8,7,4,8};
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]!=a[j] && (a[i]-a[j])<min)
					min = a[i]-a[j];
				else if(a[i]!=a[j] && a[j]-a[i]<min)
					min = a[j]-a[i];
			}
		}
		System.out.println(min);

	}

}
