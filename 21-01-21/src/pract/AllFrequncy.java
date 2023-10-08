package pract;

public class AllFrequncy {

	public static void main(String[] args) {
		String s = "aaaabbbcc";
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
		char[] c = new char[s.length()-count];
		int[] a = new int[s.length()-count];
		int ci=0, ai=0;
		for (int i = 0; i < s.length(); i++) 
		{
			count=0;
			for (int j = 0; j < c.length; j++) 
			{
				if(s.charAt(i)==c[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				c[ci++]=s.charAt(i);
			}
		}
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
			a[i]=count;	
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
					c[i] = c[j];
					c[j]=temp1;
				}
			}
		}
		System.out.println(c);
		System.out.println("Max Frequent "+c[c.length-1]);
		

	}

}
