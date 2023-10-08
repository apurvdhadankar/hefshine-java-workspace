
public class Q5 {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "abcddd";
		System.out.println(s1.compareToIgnoreCase(s2));
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int a=0;
		for (int i = 0; i < c1.length; i++) 
		{
			
			a = c1[i]-c2[i];
		}
		System.out.println(a);
		
		
	}

}
