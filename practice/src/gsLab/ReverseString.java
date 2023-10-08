package gsLab;

public class ReverseString {

	public static void main(String[] args) {
		String s= "apurv";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		StringBuilder sb1 = new StringBuilder(s);
		System.out.println(sb1.reverse());
		for (int i = s.length()-1; i>=0; i--)
		{
			s = s+s.charAt(i);
		}
		System.out.println(s);
	}

}
