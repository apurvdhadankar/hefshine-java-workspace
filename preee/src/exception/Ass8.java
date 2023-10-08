package exception;

public class Ass8 {

	public static void main(String[] args)  {
		int year=19;
		if(year<18)
		{
			try
			{
				
				throw new UserDeifeException("Invalid Year ");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
			System.out.println("allowed");
		

	}

}
