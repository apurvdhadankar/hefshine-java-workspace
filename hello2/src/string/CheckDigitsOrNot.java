package string;

public class CheckDigitsOrNot {

	public static void main(String[] args) {
		String s = "1266546546541l";
		boolean onlyDigits = true;
		for (int i = 0; i < s.length(); i++) 
		{
			char a = s.charAt(i);
			if(a<'0' || a>'9')
			{
				onlyDigits = false;
				
			}
		}
		if(onlyDigits)
			System.out.println("OnlyDigits");
		else
			System.out.println("Not Present");
		
			
	}

}
