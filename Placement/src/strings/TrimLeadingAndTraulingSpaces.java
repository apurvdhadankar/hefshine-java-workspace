package strings;

public class TrimLeadingAndTraulingSpaces {

	public static void main(String[] args) {
		String s = "     abdc efg hijkl     ";
		
		int si = 0;
		int ei = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		
		char ch[] = new char[ei-si+1];
		
		int cindex = 0;
		for (int i = si; i <= ei; i++) {
			ch[cindex++] = s.charAt(i);
		}
		
		System.out.println(ch);
	}

}
