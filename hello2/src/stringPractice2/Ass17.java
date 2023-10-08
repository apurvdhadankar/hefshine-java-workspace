package stringPractice2;

public class Ass17 {

	public static void main(String[] args) {
		String s = "abcadeeeab";
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
		int unilen = s.length()-count;
		char[] ca = new char[unilen];
		int caind=0;
		for (int i = 0; i < s.length(); i++) 
		{
			boolean flag=true;
			for (int j = 0; j < ca.length; j++) 
			{
				if(ca[j]  == s.charAt(i))
				{
					flag=false;
				}
			}
			if(flag)
			{
				ca[caind]=s.charAt(i);
				caind++;
			}
		}
		
		for (int i = 0; i < ca.length; i++) 
		{
			int charcnt=-1;
			for (int j = 0; j < s.length(); j++) 
			{
				if(ca[i]==s.charAt(j))
				{
					charcnt++;
				}
			}
			if(charcnt != 0)
			{
				System.out.println(ca[i]+" has duplicate "+charcnt);
			}
			
		}

	}
	}
