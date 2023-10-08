package stringPreeeee;

public class HW_25 {

	public static void main(String[] args) {
		String s = "aaaabbbcdc";
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
		char[] ca = new char[s.length()-count];
		int[] ia = new int[s.length()-count];
		int caindex=0, iaindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			count=0;
			for (int j = 0; j < ca.length; j++) 
			{
				if(s.charAt(i)==ca[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				ca[caindex++]=s.charAt(i);
				
			}
		}
		for (int i = 0; i < ca.length; i++) 
		{
			count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(ca[i]==s.charAt(j))
				{
					count++;
				}
			}
			ia[iaindex++]=count;
		}
//		for (int i = 0; i < ia.length; i++) 
//		{
//			System.out.println(ia[i]);
//		}
		for (int i = 0; i < ia.length; i++) 
		{
			for (int j = i+1; j < ia.length; j++) 
			{
				if(ia[i]>ia[j])
				{
					int temp = ia[i];
					ia[i]=ia[j];
					ia[j]=temp;
					
					char c = ca[i];
					ca[i]=ca[j];
					ca[j] = c;
				}
			}
		}
		for (int i = 0; i < ia.length; i++) 
		{
			System.out.print(ia[i]+" ");
		}
		System.out.println();
		System.out.println(ca);
		System.out.println("Lowest Frequency is "+ca[0]+"< - >"+ia[0]);

	}

}
