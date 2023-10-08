package stringPreeeee;

public class MaximumOccurring_HW19 {

	public static void main(String[] args) {
		String s = "aaaabbbcc";
		int max=Integer.MIN_VALUE;
		int count=0;
		int index=0;
		for (int i = 0; i < s.length(); i++) 
		{
			count=0;
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
		System.out.println(max+" "+s.charAt(index));
	}

}
