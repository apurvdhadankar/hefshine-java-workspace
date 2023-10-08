																																					package stringPre;

public class HW18 {

	public static void main(String[] args) {
		String s = "Mann Behka aadhi Raat ko";
		String sa[] = s.split(" ");
		for (int i = 0; i < sa.length/2; i++) 
		{
			String temp = sa[i];
			sa[i]=sa[sa.length-1-i];
			sa[sa.length-1-i]=temp;	
		}
		
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}
		

	}

}
