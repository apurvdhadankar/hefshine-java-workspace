package pre2;

public class StrictlyIncreaseDecrease {

	public static void main(String[] args) {
		int[] a = {5, 1, 3, 6, 8, 2, 9, 0, 10};
		int currEl=0, count=0, count1=0;
		int minEl, maxEl;
		if(a[0]<a[1])
		{
			minEl=a[0];
			maxEl=a[1];
		}
		else
		{
			minEl=a[1];
			maxEl=a[0];
		}
		for (int i = 2; i < a.length; i++) 
		{
			if(minEl < a[i])
			{
				count++;
			}
			if(maxEl > a[i])
			{
				count1++;
			}
		}
		int[] de = new int[count];
		int[] in = new int[count1];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(maxEl<a[i])
			{
				de[index]=a[i];
				index++;
			}
		}
		for (int i = 0; i < de.length; i++) 
		{
			System.out.print(de[i]);
		}

	}

}
