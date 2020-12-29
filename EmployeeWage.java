package EmployeeWageBuilder;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employeewage Computation Program");
		Random rand = new Random();
		int random = rand.nextInt(2);
		if(random==0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Present");
		}
	}
}
