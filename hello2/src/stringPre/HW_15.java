package stringPre;

public class HW_15 {

	public static void main(String[] args) {
		String s = "abcdeasjchkja";
		char a[]=s.toCharArray();
		for (int i = 0; i < a.length; i++)
		{
			int n=i%5;
			if(n<=2)
			{
				System.out.print(a[i]);
			}
		}
	}

}
