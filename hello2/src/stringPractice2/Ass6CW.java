package stringPractice2;

public class Ass6CW {

	public static void main(String[] args) {
		String s = "Apurv";
		String s1 = "apurv";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==s1.charAt(i))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}
		

	}

}
