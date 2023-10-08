package stringPrictice;

public class MaximumOccuringCharacter {

	public static void main(String[] args) 
	{
		String s = "abcdaac";
		int maxo = 0;
		int maxoi = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			int count=1;
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
				}
			}
			if(count>maxo)
			{
				maxo = count;
				maxoi = i;
			}
			
		}
		System.out.println(maxo+" "+s.charAt(maxoi));
		
	}

}
