package last_pree;

import java.util.ArrayList;
import java.util.Iterator;

public class SortStundent {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student("ad", 400));
		al.add(new Student("kk", 60));
		al.add(new Student("mk", 60));
		al.add(new Student("st", 90));
		al.add(new Student("aj", 100));

		
		for (int i = 0; i < al.size(); i++) 
		{
			for (int j = i+1; j < al.size(); j++) 
			{
				if(al.get(i).marks > al.get(j).marks)
				{
					Student temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
					
					
					
				}
				if(al.get(i).marks == al.get(j).marks)
				{
					if(al.get(i).name.compareToIgnoreCase(al.get(j).name)!=0)
					{
						Student temp = al.get(i);
						al.set(i, al.get(j));
						al.set(j, temp);
					}
				}
			}
		}
		System.out.println(al);
		
	}
}