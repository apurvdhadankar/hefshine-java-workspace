
public class PalindromeOrNot {
	public static void main(String[] args) {
		int n=2662, rem, t=n, rev=0;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==t) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		
	}

}
