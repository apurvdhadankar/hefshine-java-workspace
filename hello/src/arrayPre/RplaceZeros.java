package arrayPre;

public class RplaceZeros {

	public static void main(String[] args) {
		int[] a = {0,0,1,0,1,0,1,0};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		for(int x: a)
			System.out.print(x+" ");
		

	}

}
