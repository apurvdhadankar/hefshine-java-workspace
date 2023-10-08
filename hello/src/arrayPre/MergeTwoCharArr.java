package arrayPre;

public class MergeTwoCharArr {

	public static void main(String[] args) {
		char[] s1 = {'a','b','c','d'};
		char[] s2 = {'w','x','y','z'};
		char[] s3 = new char[s1.length+s2.length];
		int count=0;
		for (int i = 0; i < s1.length; i++)
		{
			s3[count]=s1[i];
			count++;
			s3[count]=s2[i];
			count++;
		}
		for (int i = 0; i < s3.length; i++) 
		{
			System.out.print(s3[i]+" ");
		}


	}

}
