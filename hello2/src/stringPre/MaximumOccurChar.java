package stringPre;

public class MaximumOccurChar {

	public static void main(String[] args) {
		String s = "abcdefagbcdakbla";
		int count=0;
		int maxlen=0, maxindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			count=1;
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>maxlen)
			{
				maxlen=count;
				maxindex=i;
			}
		}
		System.out.println("Maxlen is: "+maxlen);
		System.out.println("MaxIndex is "+s.charAt(maxindex));
	}

}
