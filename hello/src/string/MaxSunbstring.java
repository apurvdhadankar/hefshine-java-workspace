package string;

public class MaxSunbstring {

	public static void main(String[] args) {
		String s = "abcdefabds";
		int si=0, ei=0, max=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				boolean flag = false;
				for(int k=i; k<j; k++)
				{
				if(s.charAt(j)==s.charAt(k) || j==s.length()-1)
				{
					flag=true;
				}
				}
				if(flag)
				{
					if((j-i)>max)
					{
						max=j-i;
						si=i;
						ei=j-i;
					}
					break;
				}
			}
			
		}
		System.out.println(max);
		for (int i = si; i < ei; i++) 
		{
			System.out.print(s.charAt(i));
		}

	}

}
