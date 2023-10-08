package stringPractice2;

public class Ass16 {

	public static void main(String[] args) {
		String s = "1	ad1k54";
		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char a = s.charAt(i);
			if(a>=48 && a<=57)
			{
				sum += (s.charAt(i)-48);
			}
			
		}
		System.out.println(sum);
	}

}
