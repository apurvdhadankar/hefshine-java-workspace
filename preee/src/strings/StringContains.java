package strings;

public class StringContains {

	public static void main(String[] args) {
		String s = "pqabcdpqabcpqrjvpqrhkjfdpqr";
		String s2 = "pq";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==s2.charAt(0))
			{
				int k=i;
				boolean flag = true;
				for (int j = i; j < s2.length(); j++) 
				{
					if(s.charAt(j)!=s.charAt(k))
					{
						flag=false;
					}
				}
				if(flag)
				{
//					System.out.println(i);
					cnt++;
					if(cnt==2)
					{
						System.out.println(i);
						break;
					}
				}
			}
		}
	}

}
