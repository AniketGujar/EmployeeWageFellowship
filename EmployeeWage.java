package EmployeeWageBuilder;

import java.util.Random;

public class EmployeeWage {
	static int full_Day_Wage = 160;
	static int part_Time_Wage = 20;
	static int working_Days = 20;
	static int TotalWage;
	
		public static void main(String[] args) {
		System.out.println("Welcome to Employeewage Computation Program");
		Random rand = new Random();
		
		for(int day=0; day<working_Days; day++) {
		
		int random = rand.nextInt(3);
		if(random==0)
		{
			System.out.println("Employee is Present Part Time");
			
		int partTimeCheck = rand.nextInt(4);	
			switch (partTimeCheck) {
				case 1:
					System.out.println("Part Time Wage = " + part_Time_Wage);
					TotalWage=TotalWage+ part_Time_Wage;
					break;
                case 2:
                    System.out.println("Part Time Wage = " + part_Time_Wage*2);
                    TotalWage=TotalWage+ (part_Time_Wage*2);
                    break;
                case 3:
                    System.out.println("Part Time Wage = " + part_Time_Wage*3);
                    TotalWage=TotalWage+ (part_Time_Wage*3);
                    break;
                case 0:
                	System.out.println("Part Time Wage = " + part_Time_Wage*4);
                	TotalWage=TotalWage+ (part_Time_Wage*4);
			}
		}
		else if (random==1){
			System.out.println("Employee is Present");
			System.out.println("Daily Wage = "+ full_Day_Wage);
			TotalWage=TotalWage+ full_Day_Wage;
		}
		else {
			System.out.println("Employee Absent");
		}
		}
		System.out.println("Monthly Wage of Employee = " + TotalWage);
		}
}
