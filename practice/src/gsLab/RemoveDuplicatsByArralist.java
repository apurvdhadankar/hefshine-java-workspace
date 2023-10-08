package gsLab;

import java.util.ArrayList;

public class RemoveDuplicatsByArralist {

	public static void main(String[] args) {
		int[] a = {2,0,2,4,1,5,6,7,8,9,0,1,23,4,5,6,7,8,9,0};
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
					a[j]=0;
			}
			
			for (int j = 0; j < al.size(); j++) 
			{
				if(a[i]!=al.get(j))
					al.add(a[i]);
			}
			
		}
		System.out.println(al);
		
		//Removing Duplicates Inn String
		String s = "aaabbbbffffccv";
		int[] arr= new int[128];
		for (int i = 0; i < s.length(); i++) 
		{
			int b = s.charAt(i);
			arr[b]++;
		}
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]!=0)
			{
				System.out.print((char)(i));
			}
		}
	}

}
