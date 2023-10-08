package controlStatement;

public class EmployeeSal {

	public static void main(String[] args) {
		int sal = 20000;
		double totalSal = 0;
		if(sal <= 10000)
		{
			totalSal = totalSal+sal;
			totalSal = totalSal+(sal*0.2);
			totalSal = totalSal+(sal*0.8);
		}
		else if(sal <= 20000)
		{
			totalSal = sal+(sal*0.25)+(sal*0.9);
		}
		else
		{
			totalSal = sal+(sal*0.30)+(sal*0.9);
		}
		System.out.println(totalSal);

	}

}
