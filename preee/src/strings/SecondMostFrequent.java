package strings;

public class SecondMostFrequent {

	public static void main(String[] args) {
		String s = "aaabbccccdd";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					break;
				}
			}
		}
		
		char[] ca = new char[s.length()-cnt];
		int[] a = new int[s.length()-cnt];
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			cnt=0;
			for (int j = 0; j < ca.length; j++) 
			{
				if(s.charAt(i)==ca[j])
				{
					cnt++;
				}
			}
			if(cnt==0)
				ca[index++]=s.charAt(i);
		}
		index=0;
		for (int i = 0; i < ca.length; i++) 
		{
			cnt=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(ca[i]==s.charAt(j))
					cnt++;
			}
			a[index++]=cnt;
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
					
					char c = ca[i];
					ca[i] = ca[j];
					ca[j] = c;
				}
			}
		}
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.print(a[i]);
//		}
//		System.out.println();
//		System.out.println(ca);
		System.out.println("Second Most Frequnt "+ca[ca.length-2]);
		
	}

}
