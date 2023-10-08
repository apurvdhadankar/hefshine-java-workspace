
public class Q31_Interleave {

	static boolean interleve(String a, String b, String c)
	{
		int i=0, j=0, k=0;
		while(k!=c.length())
		{
			if(i<a.length() && a.charAt(i)==c.charAt(k))
			{
				i++;
			}
			else if(j<b.length() && b.charAt(j)==c.charAt(k))
			{
				j++;
			}
			else
			{
				return false;
			}
			k++;
		}
		if(i < a.length() || j< b.length())
			return false;
		else
			return true;
	}
	public static void main(String[] args) 
	{
		String A = "XY"; 
		String B = "X"; 
		String C = "XXY";
		if(interleve(A, B, C))
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	} 

}
