package arrayAttempt2;

public class RemoveDuplicateAss11 {

	public static void main(String[] args) {
		int[] a = {5,6, 8, 9,5,8,6, 5};
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					for (int k = j; k < a.length-1; k++) 
					{
						a[k] = a[k+1];
					}
				}
			}
		}
		
		for (int i = 0; i < a.length-cnt; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
