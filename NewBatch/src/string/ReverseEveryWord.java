package string;

public class ReverseEveryWord {

	public static void main(String[] args) {
		String s = "Aaiye apka Intejaar Hain";
		String[] sa = s.split(" ");
		String sa2[] = new String[sa.length];
		int index=0;
		for (int i = 0; i < sa.length/2; i++) 
		{
			String p = sa[i];
			sa[i]=sa[sa.length-1-i];
			sa[sa.length-1-i]=p;
		}
//		for (int i = 0; i < sa.length; i++) 
//		{
//			char[] c = sa[i].toCharArray();
//			
//			for (int j = 0; j < c.length/2; j++) 
//			{
//				char temp =c[i];
//				c[i]=c[c.length-1-j];
//				c[c.length-1-j]=temp;
//			}
//			String m = new String(c);
//			sa2[index++]=m;
//		}
		for (int i = 0; i < sa2.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}

	}

}
