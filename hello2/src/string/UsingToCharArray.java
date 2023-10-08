package string;

public class UsingToCharArray 
{
	public static void main(String[] args) 
	{
		String a = "abcde";
		char[] arr = a.toCharArray();
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
