package hello;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sal = 18000;
		double totalSal = 0;
		if(sal<=10000) {
			totalSal = totalSal+sal;
			totalSal = totalSal+(sal*0.2);
			totalSal = totalSal+(sal*0.8);
		}
		else if(sal<=20000) {
			totalSal = sal+(sal*0.25)+(sal*0.9);
		}
		else {
			totalSal = totalSal+sal;
			totalSal = totalSal+(sal*0.3);
			totalSal = totalSal+(sal*0.95);
		}
		
		System.out.println(totalSal);
	}

}
