package hello;

public class UpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c= '*';
		if(c>=65 && c<=90)
			System.out.println("UpperCase");
		else if(c>=97 && c<=122)
			System.out.println("LowerCase");
		else
			System.out.println("Symbol");

	}

}
