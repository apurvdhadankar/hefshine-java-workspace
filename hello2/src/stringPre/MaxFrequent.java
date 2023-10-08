package stringPre;

public class MaxFrequent {

	public static void main(String[] args) {
		String s = "aaabbc";
		int a[] = new int[128];
		for (int i = 0; i < s.length(); i++) 
		{
			int b = s.charAt(i);
			a[b]++;
		}
		int max=0;
		int maxindex=0;
		for (int i = 0; i < a.length; i++) 
		{
		if(max < a[i])
		{
			max=a[i];
			maxindex=i;
		}
		}
		System.out.println(max);
		char p = (char) maxindex;
		System.out.println(p);

	}

}
