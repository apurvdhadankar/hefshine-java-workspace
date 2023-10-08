package preee2nd;

public class LowestFrequncyCharQ6 {

	public static void main(String[] args) {
		String s = "aabbcccc";
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					break;
				}
			}
		}
//		System.out.println(count);
		char[] c = new char[s.length()-count];
		int[] a = new int[s.length()-count];
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			count=0;
			for (int j = 0; j < c.length; j++) 
			{
				if(s.charAt(i)==c[j])
					count++;
			}
			if(count==0)
			{
				c[index++]=s.charAt(i);
			}
		}
		System.out.println(c);
		index=0;
		for (int i = 0; i < c.length; i++) 
		{
			count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==c[i])
				{
					count++;
				}
			}
			a[index++]=count;
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
					
					char temp1 = c[i];
					c[i]=c[j];
					c[j]=temp1;
				}
			}
		}
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		for (int i = 0; i < c.length; i++) 
//		{
//			System.out.print(c[i]+" ");	
//		}
//		System.out.println();
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<=min)
			{
				System.out.println(c[i]+" -> "+a[i]);
			}
		}
	}

}
