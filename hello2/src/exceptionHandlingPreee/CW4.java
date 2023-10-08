package exceptionHandlingPreee;

public class CW4 {
	public static void main(String[] args) {
		int[] a= {10,0,1,2};
		try
		{
			System.out.println(a[10]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Exception occurs or not.....!\nThis block will always be Executed");
		}
		
	}

}
