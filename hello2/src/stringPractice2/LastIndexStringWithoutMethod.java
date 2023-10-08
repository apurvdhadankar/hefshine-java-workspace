package stringPractice2;

public class LastIndexStringWithoutMethod {

	public static void main(String[] args) {
		String s = "abcpqpq";
		String s1 = "pqr";
		int i=s.length()-1;
		int j=s1.length()-1;
		int k = s1.length();
		boolean flag=true;
		while(k>0)
		{
			if(s.charAt(i)!=s1.charAt(j))
			{
				flag=false;	
			}
			i--;
			j--;
			k--;
		}
		System.out.println(flag);
		System.out.println(i+1);

	}

}
