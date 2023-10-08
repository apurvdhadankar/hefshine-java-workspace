package string;

public class MaxiumumOccuringChar {

	public static void main(String[] args) {
		String s = "aaaaabbbbbbcc";
		int max = Integer.MIN_VALUE;
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				index=i;
			}
		}
		System.out.println(s.charAt(index)+" "+max);

	}

}
