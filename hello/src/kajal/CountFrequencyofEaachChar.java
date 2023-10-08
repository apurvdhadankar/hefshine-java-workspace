package kajal;

public class CountFrequencyofEaachChar {

	public static void main(String[] args) {
		String s = "aaaaappppkkkiiifffgggv";
		int[] a= new int[128];
		for (int i = 0; i < s.length(); i++) 
		{
			int b = s.charAt(i);
			a[b]++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				System.out.println((char)(i)+"--> "+a[i]);
			}
		}
	}

}
