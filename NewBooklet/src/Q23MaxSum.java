import java.util.Arrays;

public class Q23MaxSum {

	public static void main(String[] args) {
		int arr[] = {2, -5, 7 };
	    int mindiff=Integer.MAX_VALUE;
	    int sumo=0;
	   int sum=0;
	   int diff=0;
	    for (int i = 0; i < arr.length; i++) 
	    {
	    	sum=0;
	    	diff=0;
	    
		   for (int j = i+1; j < arr.length; j++)
		   {
			   System.out.println(arr[i]+" "+arr[j]);
			  
			sum=arr[i]+arr[j];
			 System.out.println(sum);
			if(sum<0)
			{
				diff=0-sum;
			}
			else
			{
				diff=sum-0;
			}
			if(diff<mindiff)
			{
				mindiff=diff;
				sumo=sum;
			}
		   }
		   
		}
	    System.out.println("SUM : "+sumo+" ---- "+"Min Diff : "+mindiff);
	    
	}

}
