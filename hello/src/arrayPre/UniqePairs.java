package arrayPre;

public class UniqePairs {

	public static void main(String[] args) {
		int[] a = {1,1,2};
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		int[] b = new int[a.length-count];
		int bind = 0;
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag = false;
			for (int j = i+1; j < b.length; j++) 
			{	
			 if(a[i] == a[j])
			 {
				flag=true;
			 }	
			}
			if(!flag)
			{
				b[bind]=a[i];
				bind++;
			}
		}
		int bind1=0;
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				System.out.println(b[i]+" "+b[j]);
				bind1++;
			}
		}
		System.out.println(bind1);
		
		

	}

}
