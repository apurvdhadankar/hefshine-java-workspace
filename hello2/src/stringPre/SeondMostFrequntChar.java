package stringPre;

public class SeondMostFrequntChar {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int secmin = Integer.MAX_VALUE;
		int secmax = Integer.MIN_VALUE;
		int count=0;
		String s = "aaaabbbccd";
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
		

	}

}
