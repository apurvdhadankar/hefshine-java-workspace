
public class temp {

	public static void main(String[] args) 
	{
		String s="aaaaabcd";
		int len=0;
		int si=0;
		int ei=0;
		int fsi=0;
		int fei=0;
		for (int i = 0; i < s.length(); i++) 
		{
			si=i;
			ei=i;
			for (int j = i+1; j < s.length(); j++) 
			{
				boolean flag=true;
				char c = s.charAt(j);
				for (int k = si; k <= ei; k++) 
				{
					if(s.charAt(k)==c)
						flag=false;
				}
				if(flag)
					ei++;
				else
					break;
			}
			int templen = ei-si+1;
			if(templen>len)
			{
				len = templen;
				fsi=si;
				fei=ei;
			}
		}
		System.out.println(len);
		for (int i = fsi; i <= fei; i++) 
		{
			System.out.print(s.charAt(i));
		}
	}

}
