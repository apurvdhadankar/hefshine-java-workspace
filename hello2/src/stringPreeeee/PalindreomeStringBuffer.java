package stringPreeeee;

public class PalindreomeStringBuffer {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("nitin");
		StringBuffer s2 = new StringBuffer("kajak");
		StringBuffer s3 = new StringBuffer("lokkas");
		StringBuffer s4 = new StringBuffer("mam");
		StringBuffer s5 = new StringBuffer("niin");
		StringBuffer[] sb = {s1,s2,s3,s4,s5};
		for (int i = 0; i < sb.length; i++) 
		{
			for (int j = i+1; j < sb.length; j++) 
			{
				if(sb[i].length()>sb[j].length())
				{
					StringBuffer temp = sb[i];
					sb[i]=sb[j];
					sb[j]= temp;
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
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.println(sb[i]);
			}
		}
		
	}

}
