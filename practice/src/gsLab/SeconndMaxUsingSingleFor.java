package gsLab;

public class SeconndMaxUsingSingleFor {

	public static void main(String[] args) {
		int[]a = {6,1,5,9,8,-9,7,1,6,4,21,-8,33,11};
		int max = Integer.MIN_VALUE;
		int max1 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i]>a[i+1])
			{
				 // updating the value of i = -1
                // so after getting updated for i++
                // in the loop it becomes 0 and
                // the loop begins from the start.
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				i=-1;
			}	
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Scond max is "+a[a.length-2]);
		System.out.println(a[13]);
	}

}
