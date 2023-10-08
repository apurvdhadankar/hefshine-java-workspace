
public class Q7 {

	public static void main(String[] args) {
		String s1 = "Mother in law";
		String s2 = "Hitler Woman";
		String a = s1.toUpperCase();
		String b = s2.toUpperCase();
		int count=0;
		for (int i = 0; i < a.length(); i++) 
		{
			if(a.charAt(i)==' ')
			{
				count++;
			}
		}
		char[] c1 = new char[a.length()-count];
		int index=0;
		for (int i = 0; i < a.length(); i++) 
		{
			
				if(a.charAt(i)==' ')
				{}
				else
				{
					c1[index++]=a.charAt(i);
				}
		}
//		System.out.println(c1);
		count=0;
		for (int i = 0; i < b.length(); i++) 
		{
			if(b.charAt(i)==' ')
			{
				count++;
			}
		}
		char[] c2 = new char[b.length()-count];
		index=0;
		for (int i = 0; i < b.length(); i++) 
		{
			if(b.charAt(i)==' ')
			{}
			else
			{
				c2[index++]=b.charAt(i);
			}
		}
//		System.out.println(c2);
		
		boolean flag=true;
		count=0;
		int count1=0;
		for (int i = 0; i < c1.length; i++) 
		{
			count=0;
			count1=0;
			for (int j = 0; j < c2.length; j++) 
			{
				if(c1[i]==c2[j])
				{
					flag=true;
					break;
					
				}
				else
				{
					flag=false;
					
				}
			}
		}
		System.out.println(flag);
	}

}
