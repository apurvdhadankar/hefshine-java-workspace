package stringPre;

public class Hw_30 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("kajuuu");
		StringBuffer s1 = new StringBuffer("aquaman");
		StringBuffer s2 = new StringBuffer("mim");
		StringBuffer s3 = new StringBuffer("mam");
		StringBuffer s4 = new StringBuffer("dod");
		StringBuffer s5 = new StringBuffer("madam");
		StringBuffer[] sb= {s,s1,s2,s3,s4,s5};
		for (int i = 0; i < sb.length; i++) 
		{
			for (int j = i+1; j < sb.length; j++) 
			{
				if(sb[i].length()>sb[j].length())
				{
					StringBuffer p = sb[i];
					StringBuffer q = sb[j];
					sb[j]=p;
					sb[i]=q;	
				}
			}
		}
		for (int i = 0; i < sb.length; i++) 
		{
			StringBuffer temp = sb[i];
			boolean flag=true;
			for (int j = 0; j < temp.length()/2; j++) 
			{
				if(temp.charAt(j)!=temp.charAt(temp.length()-1-j))
				{
					flag = false;
				}
			}
			if(flag)
			{
				System.out.print(sb[i]+" ");
			}
		}
		

	}

}
