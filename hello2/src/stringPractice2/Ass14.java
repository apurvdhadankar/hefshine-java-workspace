package stringPractice2;

public class Ass14 {

	public static void main(String[] args) {
		String s = "1245654654654654654655";
		boolean flag=true;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)<48 || s.charAt(i)>57)
			{
				flag=false;
			}
			
		}
		if(flag==true)
		{
			System.out.println("Only Digits");
		}
		else {
			System.out.println("Nooooooooo");
		}

	}

}
