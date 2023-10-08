package stringPrictice;

public class TwoStringsEqualOrNot {

	public static void main(String[] args) {
		String a = "apurv";
		String b = "apurvv";
//		System.out.println(a.equals(b));
		boolean flag=true;
		if(a.length() == b.length())
		{
			for (int i = 0; i < a.length(); i++) 
			{
				if(a.charAt(i) != b.charAt(i))
				{
					flag = false;
				}
					
			}
			if(flag)
				System.out.println("True");
			else
				System.out.println("False");
		}
		else
		{
			System.out.println("Length is not Same");
		}
		

	}

}
