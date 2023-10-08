package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,4,5,6,1,0,8,9,6,7,4};
		for(int j=0; j<a.length; j++)
			{
			for(int i=0; i<a.length-1; i++)
			{
				System.out.println(a[i]+" "+a[i+1]);
				if(a[i]>a[i+1])
				{
//					int p=a[i];
//					int q=a[i+1];
//					a[i]=q;
//					a[i+1]=p;
					a[i]=a[i]+a[i+1];
					a[i+1]=a[i]-a[i+1];
					a[i]=a[i]-a[i+1];
//					a[i] = a[i]*a[i+1];
//					a[i+1]=a[i]/a[i+1];
//					a[i]=a[i]/a[i+1];
				}
			}
			}
			
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
			//------------------------------------------------------
//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=i+1; j<a.length; j++)
//			{
//				if(a[i] >a[j]) {
//					int temp=a[j];
//					a[j]=a[i];
//					a[i]=temp;
//				}		
//			}
//		}
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i]+" ");
//
//	}

}
}
