
public class P {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) 
		{
			int count=0;
			for (int j = 2; j < i; j++) 
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("P");
			}
			else
			{
				System.out.println(i);
			}

	}

}
}
