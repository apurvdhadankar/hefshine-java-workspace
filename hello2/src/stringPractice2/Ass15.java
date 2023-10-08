package stringPractice2;

public class Ass15 {

	public static void main(String[] args) {
		String s = "Aaiye apaka intejaar hain";
		for (int i = 0; i < s.length(); i+=5) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.println(i+j +" " + s.charAt(i+j));
			}
		}
	}

}
