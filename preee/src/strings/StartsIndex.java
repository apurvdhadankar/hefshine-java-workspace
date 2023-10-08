package strings;

public class StartsIndex {

	public static void main(String[] args) {
		String s1 = "abcdabc";
		String s2 = "abc";
		int cnt=0;
		
		System.out.println(s1.startsWith(s2));
		boolean flag = false;
		for (int i = 0; i < s1.length(); i++) 
		{
			int j=0;
			while(s1.charAt(i)==s2.charAt(j))
			{
				i++;
				j++;
				cnt++;
				if(j==s2.length()-1)
				{
					flag = true;
					
					break;
					
				}
			}
			if(s1.charAt(i)!=s2.charAt(j))
				break;
		}
		if(flag)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
	}

}
