package stringPreeeee;

public class HW_26 {

	public static void main(String[] args) {
		String s = "abc";
		char[] ca = s.toCharArray();
		char[] ca1 = new char[ca.length*2];
		int index=0;
		for (int i = 0; i < ca.length; i++) 
		{
			ca1[index++]=ca[i];
			ca1[index++]=ca[i];
		}
		System.out.println(ca1);
	}

}
