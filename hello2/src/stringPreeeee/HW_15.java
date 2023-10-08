package stringPreeeee;

public class HW_15 {

	public static void main(String[] args) {
		String s = "abcdefghikmn";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			int n = i%5;
			if(n<=2)
			{
				System.out.println(s.charAt(i)+" "+i);
			}
		}

	}

}
