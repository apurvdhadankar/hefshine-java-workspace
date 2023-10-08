package string;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String a = "abc", b="ebcz";
		int diff = a.compareTo(b);
		System.out.println(diff);
		
		
		String c = "apurv", d="hda";
		int diff1 = c.compareTo(d);
		System.out.println(diff1);
		
		String r = " ", o = "A";
		int diff2 = r.compareTo(o);
		System.out.println(diff2);
		
//		Ignore Case
		String p="a", q="A";
		System.out.println(p.compareToIgnoreCase(q));
	}

}
