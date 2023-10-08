package arrayPre;

public class FindMeanAvgSubarry {

	public static void main(String[] args) {
		int a[] = {3,7,90,20,5,50,40};
		int k=3;
		int sum;
		double avg;
		double minavg;
		int index;
		for (int i = 0; i < a.length-k; i++) 
		{
			for (int j = i; j < i+k; j++) 
			{
				System.out.println(a[i]);
			}
			System.out.println();
		}

	}

}
