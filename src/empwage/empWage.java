package empwage;

public class empWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");


		int isPresent=1;
		int fullDay=8;
		int halfDay=4;
		int workingDaysPerMonth=20;
		int wagePerHr=20;
		int dailyWage;
		int monthlyWage;
		double empCheck=Math.floor(Math.random()*10)%2;
		switch ((int)empCheck){
			case 1:System.out.println("Employee is present");
		int fullTime=1;
			double fullTimeCheck=Math.floor(Math.random()*10)%2;
			if (fullTimeCheck == fullTime){
			dailyWage=fullDay*wagePerHr;
			System.out.println("Daily Wage of a full time employee: "+dailyWage);
			monthlyWage=dailyWage*workingDaysPerMonth;
			System.out.println("Monthly Wage of a full time employee: "+monthlyWage);
			}
			else{
				dailyWage=halfDay*wagePerHr;
				System.out.println("Daily Wage of a part time employee: "+dailyWage);
				monthlyWage=dailyWage*workingDaysPerMonth;
				System.out.println("Monthly Wage of a part time employee: "+monthlyWage);
			}
		break;
		case 0:System.out.println("Employee is absent");
		break;

		default: System.out.println("Invalid input");
		}
		
	}

}
