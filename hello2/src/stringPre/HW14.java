package stringPre;

public class HW14 {

	public static void main(String[] args) {
		String s = "1dsbkjfsdb45";
		boolean flag=true;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>=47 && s.charAt(i)<=56)
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
			System.out.println("True");
		}
		else
		{
			System.out.println("Flase");
		}

	}

}
