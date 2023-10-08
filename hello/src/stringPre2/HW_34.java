package stringPre2;

public class HW_34 {

	public static void main(String[] args) {
		String s = "kajal apurv dhadankar khairnar";
		String sa[]  = s.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = i+1; j < sa.length; j++) 
			{
				if(sa[i].length()> sa[j].length())
				{
					String x = sa[i];
					String y = sa[j];
					sa[i]=y;
					sa[j]=x;	
				}
			}
		}
		System.out.println(sa[0]);
		System.out.println(sa[sa.length-1]);

	}

}
