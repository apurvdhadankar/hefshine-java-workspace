package strings;

public class LastIndexWithinString {

	public static void main(String[] args) {
		String s1 = "abxcxda";
		String s2 = "da";
		System.out.println(s1.lastIndexOf(s2));
		int temp=0;
		int index=0;
		char sa[] = s1.toCharArray();
		char ca[] = s2.toCharArray();
		boolean flag=false;
		for (int i = sa.length-1; i >= 0; i--) 
		{
			int j=ca.length-1;
			int cnt=0;
			while(sa[i]==ca[j])
			{
				i--;
				j--;
				cnt++;
				temp=i;
				if(j==-1)
				{
					break;
				}
			}
			if(cnt==ca.length)
			{
				flag=true;
				index=temp+1;
				break;
			}
		}
		if(flag)	
			System.out.println(index);
		else
			System.out.println("-1");
		
	}

}
