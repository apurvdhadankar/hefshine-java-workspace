package prrree;

public class Q5_Longest_SubString {

	public static void main(String[] args) {
		String s = "aaaabcdaamlp";
		int si=0, ei=0, cnt=0, fsi=0, fei=0, len=0, index=0;;
		for (int i = 0; i < s.length(); i++) 
		{
			si=i;
			ei=i;
			for (int j = i+1; j < s.length(); j++) 
			{
				boolean flag=true;
				for (int k = si; k <= ei; k++) 
				{
					if(s.charAt(j) == s.charAt(k))
					{
						flag=false;
					}
				}
				if(flag)
				{
					ei++;
				}
				else
					break;
			}
			int templen = ei-si+1;
			if(templen>len)
			{
				len = templen;
				index=i;
				fsi=si;
				fei=ei;
			}
		}
		for (int i = fsi; i <= fei; i++) 
		{
			System.out.print(s.charAt(i));
		}
		

	}

}
