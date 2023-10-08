package stringPre;

public class HW30 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("nitin");
		StringBuffer s1 = new StringBuffer("aquaman");
		StringBuffer s2 = new StringBuffer("shankar");
		StringBuffer s3 = new StringBuffer("mam");
		StringBuffer s4 = new StringBuffer("Mam");
		StringBuffer[] sb= {s,s1,s2,s3,s4};
		for (int i = 0; i < sb.length; i++) 
		{
			for (int j = 0; j < sb.length; j++)
			{
				if(i<j && sb[i].length()>sb[j].length())
				{
					Object p = sb[i];
					sb[i]=sb[j];
					sb[j]=(StringBuffer) p;
				}
			}
		}
		for (int i = 0; i < sb.length; i++)
		{
			StringBuffer temp = sb[i];
			boolean flag=true;
			for (int j = 0; j < temp.length()/2; j++) 
			{
				if(temp.charAt(j)!=temp.charAt(temp.length()-j-1))
						flag=false;
			}
			if(flag)	
				System.out.print(sb[i]+" ");
		}
	}

}
