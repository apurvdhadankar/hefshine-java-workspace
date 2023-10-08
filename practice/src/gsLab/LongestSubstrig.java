package gsLab;

public class LongestSubstrig {

	public static void main(String[] args) {
		String s = "jbvjhfbvhd";
		String snew = "";
		int max= Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < s.length(); j++) 
			{
				String s1 = "";
				for (int k = i; k <= j; k++) 
				{
					s1 = s1+s.charAt(k);
				}
				if(s1.length()>max)
				{
					max= s1.length();
					snew = s1;
				}
			}
		}
		System.out.println(snew + " " + max);

	}

}
