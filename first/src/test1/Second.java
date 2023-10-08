package test1;

public class Second {

	public static void main(String[] args) {
		char[] a = {'a','b','c','d'};
		char[] b = {'w','x','y','z'};
		char s1[] = new char[a.length+b.length];
		int cnta=0;
		
		for(int i=0; i<a.length; i++)
		{
			s1[cnta]=a[i];
			cnta++;
			s1[cnta]=b[i];
			cnta++;
		}
		for (int i = 0; i < s1.length; i++) 
		{
			System.out.print(s1[i]+" ");
		}
		
	}

}
