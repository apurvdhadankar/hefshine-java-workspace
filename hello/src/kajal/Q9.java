package kajal;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		int sal = sc.nextInt();
		double totalSal=0;
		if(sal <= 10000)
		{
			totalSal = sal+totalSal;
			totalSal = totalSal+(sal*0.2);
			totalSal = totalSal+(sal*0.8);
		}
		else if(sal <= 20000)
		{
			totalSal = sal+(sal*0.25)+(sal*0.9);
		}
		else if(sal > 20000 )
		{
			totalSal = sal+totalSal;
			totalSal = totalSal+(sal*0.3);
			totalSal = totalSal+(sal*0.95);
		}
		System.out.println(totalSal);
	}

}
