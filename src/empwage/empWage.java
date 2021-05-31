package empwage;

public class empWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Welcome to Employee Wage Computation Program");
			int isPresent=1;
			double empCheck=Math.floor(Math.random()*10)%2;
			if (empCheck == isPresent){
				System.out.println("Employee is present");
			}
			else{
				System.out.println("Employee is absent");
			}
	}

}
