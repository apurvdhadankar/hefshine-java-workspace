package test;

public class Q7 {

	public static void main(String[] args) {
		String s = "apurv Dhadanakr";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length/2; i++) 
		{
			char p = c[i];
			char q = c[c.length-1-i];
			c[i]=q;
			c[c.length-1-i]=p;
		}
		System.out.println(c);

	}

}
