package stringPre;

public class HW17 {

	public static void main(String[] args) {
		String s = "apurv dhadanakr";
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
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			count=0;
			for (int j = 0; j < c.length; j++) 
			{
				if(s.charAt(i)==c[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				c[index++]=s.charAt(i);
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) 
		{
			int charcnt=-1;
			for (int j = 0; j < s.length(); j++) 
			{
				if(c[i]==s.charAt(j))
				{
					charcnt++;
				}
			}
			if(charcnt !=0)
			{
				System.out.println(c[i]+" has duplicates "+charcnt);
			}
		}
		

	}

}
