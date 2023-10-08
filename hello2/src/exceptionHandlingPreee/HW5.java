package exceptionHandlingPreee;

public class HW5 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,};
		try
		{
			System.out.println(a[50]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
