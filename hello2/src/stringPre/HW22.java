package stringPre;

public class HW22 {

	public static void main(String[] args) {
		String s = "accdeb";
		int rep=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					rep++;
					break;
				}
			}
		}
//		System.out.println(rep);
		int unilen=s.length()-rep;
//		System.out.println(unilen);
		char ca[] = new char[unilen];
		int ia[] = new int[unilen];
		int caindex=0;
		for (int i = 0; i < ca.length; i++) 
		{
			char p = s.charAt(i);
			int count=0;
			for (int j = 0; j < s.length(); j++)
			{
				if(ca[i]==p)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				ca[caindex]=p;
				caindex++;
			}
//			System.out.println(ca[i]);
		}
		for (int i = 0; i < ia.length; i++) 
		{
			int count=0;
			char q=ca[i];
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==q)
				{
					count++;
				}
			}
			if(count!=0)
			{
				ia[i]=count;
			}
//			System.out.println(ia[i]);
		}
		for (int i = 0; i < ia.length; i++)
		{
			for (int j = i+1; j < ia.length; j++) 
			{
				
					int p=ia[i];
					int q=ia[j];
					ia[i]=q;
					ia[j]=p;
					
					char x=ca[i];
					char y=ca[j];
					ca[i]=y;
					ca[j]=x;
				
			}
		}
		for (int i = 0; i < ia.length; i++) {
			System.out.print(ia[i]+" ");
			System.out.println(ca[i]+" ");
		}
		System.out.println("Second Most char is "+ca[ca.length-2]);
		
		
	}

}
