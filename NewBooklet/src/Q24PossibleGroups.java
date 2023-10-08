
public class Q24PossibleGroups {

	public static void main(String[] args) {
		int a[] = {3, 6, 7, 2, 9};
		int k=3;
		int cnt=0;
		System.out.println("Groups of 2's & 3's");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if((a[i]+a[j])%3==0)
				{
					System.out.print("["+a[i]+" "+a[j]+"]"+" ");
					cnt++;
					
				}
				for (int m = j+1; m < a.length; m++) 
				{
					if((a[i]+a[j]+a[m])%3==0)
					{
						System.out.print("["+a[i]+" "+a[j]+" "+a[m]+"]"+" ");
						cnt++;
					}
				}
			}
			
		}
//		System.out.println();
//		System.out.println("Groups Of Three's");
//		for (int i = 0; i < a.length; i++) 
//		{
//			for (int j = i+1; j < a.length; j++) 
//			{
//				
//			}
//		}
		System.out.println();
		System.out.println("Count "+cnt);
	}

}
