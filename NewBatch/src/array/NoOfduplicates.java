package array;

public class NoOfduplicates {

	public static void main(String[] args) {
		int[] a = {11,22,55,99,99,88,4,5,61,1,1,1};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println(count);

	}

}
