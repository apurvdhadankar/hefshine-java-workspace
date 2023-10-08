package gsLab;

public class PalindromeSubstrings {

	public static void main(String[] args) {
		String s = "apurvadaftfboobhinin";
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < s.length(); j++) 
			{
				String s1="";
				for (int k = i; k <= j; k++) 
				{
					s1 = s1+s.charAt(k);
				}
				boolean flag=false;
				for (int k = 0; k < s1.length(); k++) 
				{
					if(s1.charAt(k)==s1.charAt(s1.length()-1-k))
						flag= true;
					else
					{
						flag=false;
						break;
					}
				}
				if(flag==true && s1.length()>1)
				{
					System.out.println(s1);
				}
				
			}
		}
		
		
		String str = "kikik";
		int a=0;
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)==str.charAt(str.length()-1-i))
				a =1;
			else
			{
				a = 0;
				break;
			}
		}
		if(a==1)
		{
			System.out.println(str+" " + "is Palindrome");
		}
		else
		{
			System.out.println(str+" " + "is not Palindrome");
		}
	}

}
