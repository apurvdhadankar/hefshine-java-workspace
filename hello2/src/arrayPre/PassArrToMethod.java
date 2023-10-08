package arrayPre;

public class PassArrToMethod {

	int[] arrMeth(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		return arr;
	}
	public static void main(String[] args) {
		PassArrToMethod ob = new PassArrToMethod();
		int a[] = {1,2,3,4,5,6,7,8,9};
		ob.arrMeth(a); 	
	}

}
