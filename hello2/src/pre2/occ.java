package pre2;

public class occ 
{
	public static void main(String[] args) 
	{
		String st="Poonam";
		int cnt=0;
		char a[]=st.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]==a[j])
				{
					cnt++;
					break;
				}
			}
		}
//		System.out.println(cnt);
		int vnt=0;
		char b[]=new char[a.length-cnt];
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag=false;
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i]==b[j])
				{
					flag=true;
				}
			}
			if (!flag) 
			{
				b[vnt++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				if (b[i]==a[j]) 
				{
					count++;
				}
			}
			System.out.println(b[i]+" = "+count);
		}
	}
}
