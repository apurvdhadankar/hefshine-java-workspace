package gsLab;

import java.util.Arrays;

public class SortArrayInSingleLoop {
	
	static char[] sort(char[] a)
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i]>a[i+1])
			{
				char temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				i = -1;
			}
		}
		return a;
	}	

	public static void main(String[] args) {
		String s ="z487384asjnfjsd5607";
		char[] c = s.toCharArray();
		sort(c);
		System.out.println(Arrays.toString(c));

	}

}
