package string;

public class PrintAllDuplicates {

	public static void main(String[] args) {
		String s = "abcdefgaaggggkajalapurav";
		int a[] = new int[s.length()];
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
		char c[] = new char[s.length()-count];
		int index=0;
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
				c[index]=s.charAt(i);
				index++;
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]);
		}
		System.out.println();
		int charcnt=0;
		for (int i = 0; i < c.length; i++) 
		{
			charcnt=-1;
			for (int j = 0; j < s.length(); j++) 
			{
				if(c[i]==s.charAt(j))
				{
					charcnt++;
				}
			}
			if(charcnt!=0)
			{
				System.out.println("Duplicates char is : "+s.charAt(i)+" "+charcnt);
			}
		}
	}

}
