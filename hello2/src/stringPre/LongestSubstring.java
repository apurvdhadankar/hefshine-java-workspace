package stringPre;

public class LongestSubstring {

	public static void main(String[] args) {
		String s = "abcd agg rrr kalma";
		String sa[] = s.split(" ");
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < sa.length; i++) 
		{
			if(sa[i].length() > max)
			{
				max=sa[i].length();
			}
		}

		
	}

}
