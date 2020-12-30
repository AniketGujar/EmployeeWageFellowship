package EmployeeWageBuilder;

import java.util.Random;

public class EmployeeWage {
	private final int full_Day_Wage;
	private final int part_Time_Wage;
	private final int working_Days;
	private int TotalWage;
	private int totalHours;
	private final String companyName;
		
		public EmployeeWage(String companyName,int full_Day_Wage,int part_Time_Wage,int working_Days) {
			this.companyName=companyName;
			this.full_Day_Wage=full_Day_Wage;
			this.part_Time_Wage=part_Time_Wage;
			this.working_Days=working_Days;
		}
		public void wageCalculation() {
			Random rand = new Random();
			System.out.println("--------Employee wage For "+ companyName+ "--------");
			for(int day=0; day<=working_Days && totalHours<100; day++) {
			
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
		EmployeeWage Wipro = new EmployeeWage("Wipro",160,20,20);
		Wipro.wageCalculation();
		EmployeeWage TCS = new EmployeeWage("TCS",170,35,25);
		TCS.wageCalculation();
		}
}
