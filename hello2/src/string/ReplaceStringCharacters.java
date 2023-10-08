package string;

public class ReplaceStringCharacters {

	public static void main(String[] args) {
		String a = "adbcded";
		char arr[] = a.toCharArray();
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]=='d')
			{
				arr[i]='f';
			}
		}
		System.out.println("Old String : "+ a);
//		For changing String
//		a= new String(arr);
//		System.out.println(a);
		String b = new String(arr);
		
		System.out.println("New String : "+ b);
		
	}

}
