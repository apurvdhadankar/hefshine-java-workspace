package test;

public class PalindromeWithotMethod {

	public static void main(String[] args) {
		String s = "abcadd1232bcbad";
		
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < s.length(); j++) 
			{
				String s1="";
				for (int k = i; k <= j; k++) 
				{
					s1 = s1 +s.charAt(k);
				}
				boolean flag=true;
				for (int k = 0; k < s1.length(); k++) 
				{
					if(s1.charAt(k)==s1.charAt(s1.length()-1-k))
					{
						flag=true;
					}
					else
					{
						flag=false;
						break;
					}
				}
				if(flag && s1.length()>1)
				{					
					System.out.println(s1);
				}
			}
		}
		

	}

}
