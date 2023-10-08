package string;

public class RepeatEachCharTwice {

	public static void main(String[] args) {
		String s = "abcde";
		char ca[] = new char[s.length()*2];
		int j=0;
		for (int i = 0; i < s.length(); i++) {
			
			ca[j]=s.charAt(i);
			j++;
			ca[j]=s.charAt(i);
			j++;
		}
//		for (int i = 0; i < ca.length; i++) {
//			System.out.println(ca[i]);
//		}
		s=new String(ca);
		System.out.println(s);

	}

}
