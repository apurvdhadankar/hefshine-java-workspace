package string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Nadla Ki Fadla";
		String[] sa = s.split(" ");
		for (int i = sa.length-1; i >= 0; i--) 
		{
			System.out.print(sa[i]+" ");
		}

	}

}
