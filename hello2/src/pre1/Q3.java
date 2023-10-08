package pre1;

public class Q3 {

	public static void main(String[] args) {
		String s = "abcdaaaaaaa abbbbbbbbbbbbbbbbbbc ab aaaaaaaaaaaaaaaaaaaaaaaaa";
		String sa[] = s.split(" ");
		int a[] = new int[sa.length];
		for (int i = 0; i < sa.length; i++) 
		{
			String temp = sa[i];
			char[] c = temp.toCharArray();
			int count=0;
			for (int j = 0; j < sa[i].length(); j++) 
			{
				for (int k = j+1; k < c.length; k++) 
				{
					if(c[j]==c[k])
					{
						count++;
						break;
					}
				}
			}
//			System.out.println(count);
			a[i]= sa[i].length()-count;
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					String temp1 = sa[i];
					sa[i]=sa[j];
					sa[j]=temp1;
					
				}
			}
		}
		System.out.println(sa[0]);
		System.out.println(a[0]);
		
		System.out.println(sa[sa.length-1]);
		System.out.println(a[a.length-1]);
	}

}
