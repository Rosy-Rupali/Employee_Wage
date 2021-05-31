package empwage;

public class empWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");


		int isPresent=1;
		int fullDay=8;
		int wagePerHr=20;
		int dailyWage;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck == isPresent){
			System.out.println("Employee is present");
			dailyWage=fullDay*wagePerHr;
			System.out.println("Daily Wage of an employee: "+dailyWage);
		}
		else{
			System.out.println("Employee is absent");
		}
	}

}
