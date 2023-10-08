package stringPre;

public class OnlyDigits {

	public static void main(String[] args) {
		String s = "152";
		boolean flag=true;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=56)
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Only Digits");
		}
		else
		{
			System.out.println("Not Only Digits");
		}

	}

}