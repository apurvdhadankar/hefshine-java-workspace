package stringPrictice;

public class CheckDigitsOrNot {

	public static void main(String[] args) {
		String s = "5555";
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
				flag = false;
		}
		if(flag)
			System.out.println("Only Digits");
		else
			System.out.println("Not Present");

	}

}
