package gsLab;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "apurv atul dhadankar";
		String[] sa = s.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
			StringBuffer sb = new StringBuffer(sa[i]);
			sb.reverse();
			System.out.print(sb+" ");
		}
		System.out.println();
		//without using SB
		String[] sa1 = new String[sa.length];
		int index=0;
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = 0; j < sa[i].length(); j++) 
			{
				char[] c = sa[i].toCharArray();
				for (int k = 0; k < c.length/2; k++) 
				{
					char temp = c[k];
					c[k] = c[c.length-1-k];
					c[c.length-1-k] = temp;
				}
				String m = new String(c);
				sa1[i] = m;
			}
		}
		for (int i = 0; i < sa1.length; i++) 
		{
			System.out.print(sa1[i]+" ");
		}
	}

}
