package stringPre;

public class HW16 {

	public static void main(String[] args) {
		String s = "374892vnksjd73489";
		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char a= s.charAt(i);
			if(a>=47 && a<=53)
			{
				sum += (s.charAt(i)-48);
			}
		}
		System.out.println(sum);
		
		

	}

}
