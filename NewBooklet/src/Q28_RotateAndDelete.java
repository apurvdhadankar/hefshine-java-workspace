
public class Q28_RotateAndDelete {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		int size = a.length;
		int k=2;
		while(size>1)
		{
//			rotate right
			int temp = a[a.length-1];
			for (int i = a.length-1; i > 0; i--) 
			{
				a[i] = a[i-1];
			}
			a[0]=temp;
//			for (int i = 0; i < a.length; i++) {
//				System.out.print(a[i]+" ");
//			}
//			System.out.println();
//			calc del no
			int delindex=a.length-k+1;
			int delno=0;
			if(delindex>0)
				delno=a[delindex];
			else
				delno=a[0];
			int[] b = new int[a.length-1];
//			transer all except delno
			int index=0;
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]!=delno)
				{
					b[index++]=a[i];
				}
			}
//			assign b to a
			a=b;
//			update size
			size = a.length;
			k++;
		}
		System.out.println(a[0]);

	}

}
