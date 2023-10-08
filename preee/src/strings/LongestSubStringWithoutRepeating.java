package strings;

public class LongestSubStringWithoutRepeating {

	public static void main(String[] args) {
		String s = "aaa abcdaa abcde ab abcde";
		int max = Integer.MIN_VALUE;
		int maxindex=0;
		String[] sa = s.split(" ");
		
		for (int i = 0; i < sa.length; i++) 
		{
			int cnt=0;
			for (int j = 0; j < sa[i].length(); j++) 
			{
				for (int k = j+1; k < sa[i].length(); k++) 
				{
					if(sa[i].charAt(j)==sa[i].charAt(k))
					{
						cnt++;
						break;
					}
				}
			}
			int unilen = sa[i].length()-cnt;
			if(unilen>max)
			{
				max=unilen;
				maxindex=i;
			}
		}
		System.out.println(max + " "+ sa[maxindex]);
	}

}
