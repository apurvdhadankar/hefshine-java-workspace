
public class Q6ContiansMethd {

	public static void main(String[] args) {
		String s = "abcd";
		String s1 = "ab";
		boolean flag=false;
		int len = s1.length();
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s.charAt(i)==s1.charAt(i))
			{
				flag = true;
			}
		}
//		for (int i = 0; i < s.length(); i++)
//		{
//			if(s.charAt(i)==s1.charAt(i))
//			{
//				flag=true;
//			}
//		}
		System.out.println(flag);
		
		
		//------------------------------------
//		s.contains(s1);
//		int i=s.length()-1;
//		int j=s1.length()-1;
//		int k=s1.length();
//		boolean flag=false;
//		while(k>0)
//		{
//			if(s.charAt(i)!=s.charAt(j))
//			{
//				flag = true;
//			}
//			i--;
//			j--;
//			k--;
//		}
//		System.out.println(flag);

	}

}
