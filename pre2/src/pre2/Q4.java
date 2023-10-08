package pre2;

public class Q4 {

	public static void main(String[] args) {
		char[] s1 = {'a','b','c','d','e','f','g'};
		char[] s2 = {'p','q','r','s'};
		int n = s2.length-1;
		char[] s3 = new char[s1.length+s2.length];
		int index=0;
		for (int i = 0; i < s1.length; i++) 
		{
			s3[index]=s1[i];
			index++;
			while(n==s2.length)
			{
			s3[index]=s2[i];
			index++;
			}
		}
			
		for (int i = 0; i < s3.length; i++) 
		{
			System.out.print(s3[i]);
		}
	}

}
