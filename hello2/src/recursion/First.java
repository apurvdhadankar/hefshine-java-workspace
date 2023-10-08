package recursion;

public class First {

	public static void main(String[] args) {
		printMessage(0, 10);
		

	}

	private static void printMessage(int i, int j) {
		if(i < j)
		{
			System.out.println(i);
			printMessage(++i, j);
		}
		
	}

}
