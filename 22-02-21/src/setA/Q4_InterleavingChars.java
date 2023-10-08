package setA;

public class Q4_InterleavingChars {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "wxyzefg";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		char[] c3 = new char[c1.length+c2.length];
		int len =0, index=0;
		if(c1.length < c2.length)
		{
			len = c1.length;
			for (int i = 0; i < len; i++) 
			{
				c3[index++] = c1[i];
				c3[index++] = c2[i];
			}
			for (int i = len; i < c2.length; i++) 
			{
				c3[index++] = c2[i];
			}
			
		}
		else
		{
			len = c2.length;
			for (int i = 0; i < len; i++) 
			{
				c3[index++] = c1[i];
				c3[index++] = c2[i];
			}
			for (int i = len; i < c1.length; i++) 
			{
				c3[index++] = c1[i];
			}
		}
		System.out.println(c3);

	}

}
