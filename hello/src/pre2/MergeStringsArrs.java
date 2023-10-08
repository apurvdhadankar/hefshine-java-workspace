package pre2;

public class MergeStringsArrs {

	public static void main(String[] args) {
		char s1[] = {'a','b','c','d'};
		char s2[] = {'e','f','g','w','x','y','z'};
		int index=0;
		int n=0; 
		char s3[] = new char[s1.length+s2.length];
		if(s1.length<s2.length)
		{
			for (int i = 0; i < s2.length; i++) 
			{
				s3[index]=s2[i];
				index++;
				for (int j = 0; j < s1.length; j++) 
				{
					if(i==j)
					{
						s3[index]=s1[i];
						index++;
					}
				}
			}
		}
		if(s1.length>s2.length)
		{
			for (int i = 0; i < s1.length; i++) 
			{
				s3[index]=s1[i];
				index++;
				for (int j = 0; j < s2.length; j++) 
				{
					if(i==j)
					{
						s3[index]=s2[i];
						index++;
					}
				}
			}
		}
		
		for (int i = 0; i < s3.length; i++) 
		{
			System.out.print(s3[i]+" ");
		}
	}
}


