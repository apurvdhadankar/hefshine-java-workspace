package gsLab;

public class SeondMostFrequntChar {

	public static void main(String[] args) {
		String s = "aaaabbbcccaa";
		int[] a = new int[128];
		for (int i = 0; i < s.length(); i++) 
		{
			int b = s.charAt(i);
			a[b]++;
		}
		int max1 = Integer.MIN_VALUE;
		int maxindex=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(max1<a[i])
			{
				max1=a[i];
				maxindex=i;
			}
		}
		System.out.println("Most Frequent ->"+(char)(maxindex)+" "+max1);
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(max2<a[i] && a[i]!=max1)
			{
				max2=a[i];
				maxindex=i;
			}
		}
		System.out.println("Second Most Frequnt ->"+(char)(maxindex)+" "+max2);
	}

}
