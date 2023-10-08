package pre;

public class Q7_getIndexOfString {

	public static void main(String[] args) {
		String s1 = "pqrrraiiiibpqabcpqappq";	
		String s2 = "pq";
		int index=0;
		int cnt=0;
		for (int i = 0, j=0; i < s1.length()-1; i++) 
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				if(s1.charAt(i+1)==s2.charAt(j+1))
				{
					cnt++;
					if(cnt==2)
						index=i;
				}
			}
		}
		System.out.println(index);
		
	}

}
