package stringPreeeee;

public class HW_30 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("madam");
		StringBuffer s2 = new StringBuffer("katalya");
		StringBuffer s3 = new StringBuffer("dad");
		StringBuffer s4 = new StringBuffer("laal");
		StringBuffer s5 = new StringBuffer("talat");
		StringBuffer[] sa = {s1,s2,s3,s4,s5};
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = i+1; j < sa.length; j++) 
			{
				if(sa[i].length()>sa[j].length())
				{
					Object temp = sa[i];
					sa[i]=sa[j];
					sa[j]=(StringBuffer) temp;				
				}
			}
		}
		for (int i = 0; i < sa.length; i++) 
		{
			StringBuffer temp = sa[i];
			boolean flag=true;
			for (int j = 0; j < temp.length()/2; j++) 
			{
				
				if(temp.charAt(j)!=temp.charAt(temp.length()-j-1))
				{			
					flag = false;
				}
			}
			if(flag)
			{
				System.out.println(sa[i]);	
			}
		}
	}
}
