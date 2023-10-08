package recursionPre;

public class Print1ToN {
	static int i=1;
	static void printNumbers(int n)
	{
		if(i<=n)
		{
			System.out.println(i);
			i++;
			printNumbers(n);
		}
	}

	public static void main(String[] args) 
	{
		printNumbers(1000);

	}

}
