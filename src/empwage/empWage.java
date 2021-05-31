package empwage;

public class empWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program");


		int isFullTime=1;
		int isHalfTime=2;
		int workingDaysPerMonth=20;
		int maxHrsInMonth=100;
		int wagePerHr=20;
		int totalWorkingDays=0;
		int totalEmpHrs=0;
		
		while(totalEmpHrs <= maxHrsInMonth || totalWorkingDays <= workingDaysPerMonth)
		{	
			totalWorkingDays++;
			int attendance=(int)(Math.random()*3);
			int empHrs=0;
			switch(attendance) {
			case 1: 
				empHrs=8;
				break;
			case 2:
				empHrs=4;
				break;
			default:
				empHrs=0;
				break;
			}
			totalEmpHrs=(totalEmpHrs+empHrs);
		}
		int totalSalary=(totalEmpHrs*totalWorkingDays);
		System.out.println("Salary of an Employee: "+totalSalary);
	}

}
