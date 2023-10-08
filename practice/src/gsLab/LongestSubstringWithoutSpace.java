package gsLab;

public class LongestSubstringWithoutSpace {

	public static void main(String[] args) {
		String s = "dfjdf jvdjv sdijodsjv ijdsoisdj osdjvdjvsdd";
		String snew = "";
		int max= Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < s.length(); j++) 
			{
				String s1 = "";
				for (int k = i; k <= j; k++) 
				{
					if(s.charAt(k)==' ')
					{
						
						break;
					}
					s1 = s1+s.charAt(k);
				}
				for (int k = 0; k < s1.length(); k++) 
				{
					if(s1.length()>max)
					{
						max= s1.length();
						snew = s1;
					}
				}
			}
		}
		System.out.println(snew + " " + max);


	}

}
