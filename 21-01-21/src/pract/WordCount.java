package pract;

public class WordCount {
	public static void main(String[] args) {
		String s = "an apple is an apple an apple";
		String[] sa = s.split(" ");
		int count=0;
		for (int i = 0; i < sa.length; i++) 
		{
			count=1;
			for (int j = i+1; j < sa.length; j++) 
			{
				if(sa[i].compareTo(sa[j])==0)
				{
					sa[j]="@@";
					count++;			
				}
			}
			if(sa[i].compareTo("@@")!=0)
			{
				System.out.println(sa[i]+" "+count);
			}
			
		}
		}
		
	}


