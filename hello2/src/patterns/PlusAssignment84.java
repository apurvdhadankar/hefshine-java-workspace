package patterns;

public class PlusAssignment84 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j==2 || i==2)//j-i>0 && i+j<8
					System.out.print("*");
//				else if(j==2)
//					System.out.println("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	}

}
}
