package string;

public class SplitStringWithoutUsingMethod {

	public static void main(String[] args) {
		String s = "ab cdef gh ijk lmno pqr stu ";
		int count =0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ' ')
				count++;
		}
		System.out.println(count);
		String[] sa = new String[count+1];
		int si=0;
		int ei = 0;
		int saindex=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				ei=i;
//				Create new cahr array
				char[] a = new char[ei-si];
//				shift all ele from string in char array
				int aiindex=0;
				for (int j = si; j < ei; j++)
				{
					a[aiindex]= s.charAt(j);
					aiindex++;
				}
//				convert char array to string
				String s1 = new String(a);
//				save string in string array Sa
				sa[saindex]=s1;
				saindex++;
				si=i+1;
			}
		}
		for (int i = 0; i < sa.length; i++)
		{
			System.out.println(sa[i]);
		}
	}

}
