package stringPractice2;

public class Ass18 {

	public static void main(String[] args) {
		String s = "Aaiye aapka intejaar hain";
		String[] ca = s.split(" ");
		for (int i = 0; i < ca.length/2; i++) {
			String p=ca[i];
			String q=ca[ca.length-1-i];
			ca[ca.length-1-i]=p;
			ca[i]=q;
					
		}
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.print(ca[i]+" ");
		}
//		for (int i = 0; i < ca.length; i++) 
//		{
//			System.out.print(ca[i]+" ");
//		}
//		
//		System.out.println(s);

	}

}
