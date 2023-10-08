package cntrlStmt;

public class Salary {

	public static void main(String[] args) {
		double  sal=15000, totalSal=0;
		if(sal <= 10000)
		{
			totalSal = sal+(sal * 0.20) + (sal*0.8);
		}
		else if(sal <= 20000)
		{
			totalSal = sal+(sal * 0.25) + (sal*0.9);
		}
		else
		{
			totalSal = sal+(sal * 0.30) + (sal*0.95);
		}
		System.out.println(totalSal);
	}

}
