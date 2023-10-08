package string;

public class SecondMostFrequent {

	public static void main(String[] args) {
		String s = "aaaabbbcc";
	
		int max = Integer.MIN_VALUE;
		char maxChar = s.charAt(0);
		
		int Secondmax = Integer.MIN_VALUE;
		char SecondmaxChar = s.charAt(0);
		for (int i = 0; i < s.length(); i++) 
		{
			int cnt=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt>max)
			{
				max = cnt;
				maxChar = s.charAt(i);
			}
		}
//		System.out.println(max+" "+maxChar);
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!=maxChar)
			{
				int cnt=0;
				for (int j = 0; j < s.length(); j++) 
				{
					if(s.charAt(i)==s.charAt(j))
					{
						cnt++;
					}
				}
				if(cnt>Secondmax)
				{
					Secondmax = cnt;
					SecondmaxChar = s.charAt(i);
				}
			}
		}
		System.out.println(Secondmax+" "+SecondmaxChar);
		
	}

}
