package stringPreeeee;

public class ReverseEveryWord {

	public static void main(String[] args) {
		String s = "Nadla Ki Fadla";
		String[] sa = s.split(" ");
		String[] sa1 = new String[sa.length];
		int index=0;
		for (int i = 0; i < sa.length; i++) 
		{
			char[] c = sa[i].toCharArray();
			for (int j = 0; j < c.length/2; j++) 
			{
				
				char temp = c[j];
				c[j]=c[c.length-j-1];
				c[c.length-j-1]=temp;
				
			}
			String m = new String(c);
			sa1[index++]=m;
			
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa1[i]+" ");
		}
	}

}
