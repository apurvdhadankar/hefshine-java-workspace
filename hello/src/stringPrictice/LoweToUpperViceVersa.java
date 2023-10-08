package stringPrictice;

public class LoweToUpperViceVersa {

	public static void main(String[] args) {
		String s1 = "abcdeABC";
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i) >=97)
			{
				s1.toLowerCase();
			}
			else
				s1.toUpperCase();
				
		}
		System.out.println(s1);

	}

}
