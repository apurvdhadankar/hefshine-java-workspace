package stringPre;

public class HW_29 {

	public static void main(String[] args) {
		String sa[] = {"aaa", "kaju", "honey", "aqua", "ambulanace", "Fantasy", "Gian", "Sunio"};
		int a[] = new int[sa.length];
		for (int i = 0; i < a.length; i++) {
			a[i]=sa[i].length();
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					String temp1 = sa[i];
					sa[i] = sa[j];
					sa[j]=temp1;
				}
				
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}
		
		System.out.println("\nDescending Order  ");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					String temp1 = sa[i];
					sa[i] = sa[j];
					sa[j]=temp1;
				}
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}
		}
	}


