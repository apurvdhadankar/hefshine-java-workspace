package stringPreeeee;

public class AllFrequentPrograms {

	public static void main(String[] args) {
		String s ="aaaaabbbbccccdd";
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
//		System.out.println(ca);
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
		for (int i = 0; i < ia.length; i++) 
		{
			for (int j = i+1; j < ia.length; j++) 
			{
				int temp = ia[i];
				ia[i]=ia[j];
				ia[j]=temp;
				
				char c = ca[i];
				ca[i]=ca[j];
				ca[j]=c;
			}
		}
		for (int i = 0; i < ia.length; i++) 
		{
			System.out.print(ia[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		System.out.println("Most Frequent "+ca[ca.length-1]);
		System.out.println("Second Most Frequent "+ca[ca.length-2]);
		System.out.println("Lowest Frequnt "+ca[0]);
	}

}
