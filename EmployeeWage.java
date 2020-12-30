package EmployeeWageBuilder;

import java.util.Random;

public class EmployeeWage {
	static int full_Day_Wage;
	static int part_Time_Wage;
	static int working_Days=20;
	int TotalWage;
	int totalHours;
	String companyName;
		public void wageCalculation(String companyName,int full_Day_Wage,int part_Time_Wage) {
			Random rand = new Random();
			System.out.println("--------Employee wage For "+ companyName+ "--------");
			for(int day=0; day<working_Days || totalHours<100; day++) {
			
			int random = rand.nextInt(3);
			if(random==0)
			{
			int partTimeCheck = rand.nextInt(4);	
				switch (partTimeCheck) {
					case 1:
						System.out.println("Day " + day  +"\t\t"+"Part Time Wage "+"\t\t"+ part_Time_Wage);
						TotalWage=TotalWage+ part_Time_Wage;
						totalHours=totalHours+1;
						break;
	                case 2:
	                    System.out.println("Day " + day  +"\t\t"+"Part Time Wage" + "\t\t"  + part_Time_Wage*2);
	                    TotalWage=TotalWage+ (part_Time_Wage*2);
	                    totalHours=totalHours+2;
	                    break;
	                case 3:
	                    System.out.println("Day " + day  +"\t\t"+"Part Time Wage "+"\t\t"+ part_Time_Wage*3);
	                    TotalWage=TotalWage+ (part_Time_Wage*3);
	                    totalHours=totalHours+3;
	                    break;
	                case 0:
	                	System.out.println("Day " + day  +"\t\t"+"Part Time Wage "+"\t\t"+ part_Time_Wage*4);
	                	TotalWage=TotalWage+ (part_Time_Wage*4);
	                	totalHours=totalHours+4;
				}
			}
			else if (random==1){
				System.out.println("Day " + day  +"\t\t"+"Employee is Present "+"\t"+ full_Day_Wage);
				TotalWage=TotalWage+ full_Day_Wage;
				totalHours=totalHours+8;
			}
			else {
				System.out.println("Day " + day  +"\t\t"+"Employee Absent"+"\t\t"+ 0);
			}
			}
			System.out.println("Monthly Wage of Employee = " + TotalWage+ " \nTotal Employee working(hrs): "+ totalHours);
			}
	
		public static void main(String[] args) {
		System.out.println("Welcome to Employeewage Computation Program");
		EmployeeWage company1 = new EmployeeWage();
		company1.wageCalculation("Wipro",160,20);
		EmployeeWage company2 = new EmployeeWage();
		company2.wageCalculation("TCS",170,35);
		}
}
