package stringPractice2;

public class LastIndexOfChar {

	public static void main(String[] args) {
		String s = "abcpqrabpqabc";
//		System.out.println(s.lastIndexOf('e'));
//		System.out.println(s.lastIndexOf("ab"));
//		char c = 'a';
		String s1 = "ab";
		for (int i = s.length()-1; i >= 0; i--) 
		{
			if(s.charAt(i)=='q' && s.charAt(i-1)=='p')
			{
				System.out.println(i-1);
				break;
			}
		}

	}

}
