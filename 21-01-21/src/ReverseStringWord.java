
public class ReverseStringWord {

	public static void main(String[] args) {
		String s = "I go to school.";
		
		String s1="";
		char q=s.charAt(s.length()-1);
		for (int i = 0; i < s.length()-1; i++) {
			s1=s1+s.charAt(i);
		}
		String sa[]=s1.split(" ");
		char c1[]=sa[0].toCharArray();
		
		if(c1[0]<=90&&c1[0]>=65) {
			 c1[0]= (char) (c1[0]+32);
		}
		char c2[]=sa[sa.length-1].toCharArray();
		
		if(c2[0]<=122&&c2[0]>=97) {
			c2[0]= (char) (c2[0]-32);
		}
		String s2="";
		sa[0]=new String(c1);
		sa[sa.length-1]=new String(c2);
		for (int i = 0; i < sa.length/2; i++) {
			String sw=sa[i];
			sa[i]=sa[sa.length-1-i];
			sa[sa.length-1-i]=sw;
			
		}
		for (int i = 0; i < sa.length; i++) {
			if(i<sa.length-1) {
				s2=s2+sa[i]+" ";
			}else {
				s2=s2+sa[i];
			}
		}
		String s3=s2+q;
		System.out.println(s3);
	}

}
