package gsLab;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int[] a = {1,1,2,3,6,5,4,8,9,5,9,4,6};
		for (int i = 0; i < a.length; i++) 
		{
			int cnt=1;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					a[j]=0;
					cnt++;
				}
			}
			if(a[i]!=0)
			{
				System.out.println(a[i]+" "+cnt);
			}
		}

	}

}
