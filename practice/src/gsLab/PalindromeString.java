package gsLab;

public class PalindromeString {
	public static boolean palindromeChecker(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if(str.equals(rev))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(palindromeChecker("nitin"));
		System.out.println(palindromeChecker("aka"));
		System.out.println(palindromeChecker("boob"));
		System.out.println(palindromeChecker("apurv"));
	}

}
