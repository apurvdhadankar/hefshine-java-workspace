package stringPrictice;

public class FindMaxLengthSubString {

	public static void main(String[] args) {
		String a = "abc def hij klmo pqrst uvwx yz ";
		String[] b = a.split(" ");
		int maxlen=0;
		int maxlenindex=0;
		for (int i = 0; i < b.length; i++) 
		{
			if(b[i].length()>maxlen)
			{
				maxlen = b[i].length();
				maxlenindex=i;
			}
		}
		System.out.println("max lenght is "+maxlen);
		System.out.println("Element is "+b[maxlenindex]);
	}

}
