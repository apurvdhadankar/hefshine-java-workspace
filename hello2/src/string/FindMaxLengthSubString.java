package string;

public class FindMaxLengthSubString {

	public static void main(String[] args) {
		String s = "ab cdef gh ijk lmno pqr stu ";
		String sa[] = s.split(" ");
		int maxlen=0;
		int maxlenindex=0;
		for (int i = 0; i < sa.length; i++) 
		{
			if(sa[i].length()>maxlen)
			{
				maxlen=sa[i].length();
				maxlenindex=i;
			}
		}
		System.out.println("max lenght is "+maxlen);
		System.out.println("Element is "+sa[maxlenindex]);

	}

}
