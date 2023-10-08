package oops;

public class GetterSetter {

	
		private int stock=5;
		
		public void setStock(int p)
		{
			if(p>=0)
			{
				stock=p;
			}
		}
		
		public int getStock()
		{
			return stock;
		}

	

}
