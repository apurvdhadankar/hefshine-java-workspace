package mains;

public class EvenOddMethod {
	int num;
	int i=1;
	public void even() throws InterruptedException
	{
		i=1;
		
			i++;
			{
				notify();
				System.out.println(i);
			}
			wait();
		}
	
	public void odd() throws InterruptedException
	{
		
			
			i++;
			{
				notify();
				System.out.println(i);
			}
			wait();
		}
	}


