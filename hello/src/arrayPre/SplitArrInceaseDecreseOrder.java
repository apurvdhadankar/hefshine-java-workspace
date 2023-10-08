package arrayPre;

public class SplitArrInceaseDecreseOrder {

	public static void main(String[] args) {
		int[] a = {5, 1, 3, 6, 8, 2, 9, 0, 10};
		int cnt=0, cnt1=0;
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[min]>a[j])
					min =j;
				
				if(a[min]<a[j])
				{
					cnt++;
					break;
					
				}
				else
				{
					cnt1++;
					break;
				}
				
			}
		}
		System.out.println(cnt);
		System.out.println(cnt1);
		int b[] = new int[cnt];
		int binx=0;
		int c[] = new int[a.length-cnt1];
		int cinx=0;
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag= true;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]<b[j])
				{
					flag=false;
				}
			}
			if(flag)
			{
				b[binx]=a[i];
				binx++;
			}
//			else
//			{
//				c[cinx]=a[i];
//				cinx++;
//			}
		}
//		for (int i = 0; i < c.length; i++) 
//		{
//			System.out.print(c[i]+" ");
//		}
		System.out.println();
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
