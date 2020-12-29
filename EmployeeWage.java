package EmployeeWageBuilder;

import java.util.Random;

public class EmployeeWage {
	static int full_Day_Wage = 160;

	public static void main(String[] args) {
		System.out.println("Welcome to Employeewage Computation Program");
		Random rand = new Random();
		int random = rand.nextInt(2);
		if(random==0)
		{
			System.out.println("Employee is Absent");
			System.out.println("Daily Wage = "+ 0);
		}
		else
		{
			System.out.println("Employee is Present");
			System.out.println("Daily Wage = "+ full_Day_Wage);
		}
	}
}
