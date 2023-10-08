package arrarPre2;

public class MergeTwoCharArrays {

	public static void main(String[] args) {
		char[] s1 = {'a','b','c','d'};
		char[] s2 = {'w','x','y','z','e','f','g'};
		char[] s3 = new char[s1.length+s2.length];
		int index=0, len=0;;
		if(s1.length<s2.length)
		{
			len = s1.length;
		}
		else
		{
			len = s2.length;
		}
		for (int i = 0; i < len; i++) 
		{
			s3[index]=s1[i];
			index++;
			s3[index]=s2[i];
			index++;
		}
		
		if(s1.length>s2.length)
		{
			for (int i = len; i < s1.length; i++) 
			{
				s3[index]=s1[i];
				index++;
			}
		}
		else
		{
			for (int i = len; i < s2.length; i++) 
			{
				s3[index]=s2[i];
				index++;
			}
		}
		for (int i = 0; i < s3.length; i++) 
		{
			System.out.print(s3[i]+" ");
		}

	}

}
