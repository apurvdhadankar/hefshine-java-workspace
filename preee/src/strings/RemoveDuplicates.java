package strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "aabbcccdddk";
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
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			cnt=0;
			for (int j = 0; j < ca.length; j++) 
			{
				if(s.charAt(i)==ca[j])
					cnt++;
			}
			if(cnt==0)
			{
				ca[index++]=s.charAt(i);
			}
		}
		System.out.println(ca);

	}

}
