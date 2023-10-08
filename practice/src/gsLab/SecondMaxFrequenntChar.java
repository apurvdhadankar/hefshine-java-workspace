package gsLab;

public class SecondMaxFrequenntChar {

	public static void main(String[] args) {
		String s = "a    aa   abb    bcc";
		int[] a = new int[128];
		for (int i = 0; i < s.length(); i++) 
		{
			int b = s.charAt(i);
			a[b]++;
		}
		int max=0;
		int maxindex=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(max<a[i] && i!=32)
			{
				max=a[i];
				maxindex=i;
			}
		}
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(max2<a[i] && i!=32 && a[i]!=max)
			{
				max2=a[i];
				maxindex=i;
			}
		}
		System.out.println(max2);
		System.out.println((char)(maxindex) +":" + max2);

	}

}
