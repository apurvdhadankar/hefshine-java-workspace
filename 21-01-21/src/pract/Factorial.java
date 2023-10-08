package pract;

public class Factorial {

	public static void main(String[] args) {
		int fact=6;
		for(int i=fact-1; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
