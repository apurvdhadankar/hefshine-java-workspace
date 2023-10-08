package stringPractice2;

public class Ass3 {

	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello World";
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not Equal");
			}
		}

	}

}
